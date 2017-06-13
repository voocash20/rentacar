package rentacar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rentacar.bean.RentForm;
import rentacar.domain.Customer;
import rentacar.domain.LuxuryCar;
import rentacar.domain.Rent;
import rentacar.repo.CustomerRepo;
import rentacar.repo.LuxuryCarRepo;
import rentacar.repo.RentRepo;

@Service
public class RentService {

	@Autowired
	private CustomerRepo customerRepo;
	@Autowired
	private LuxuryCarRepo luxuryCarRepo;
	@Autowired
	private RentRepo rentRepo;
	
	public Rent rent(RentForm form){
		Customer customer = customerRepo.findOne(form.getCustomerId());
		if (customer==null){
			throw new RuntimeException("no such customer");
		}
		
		LuxuryCar car = luxuryCarRepo.findOne(form.getCarId());
		if (car==null){
			throw new RuntimeException("no such car");
		}
		Rent rent = new Rent(customer,car,form.getBegin(),form.getEnd());
		return rentRepo.save(rent);
		
	}
	
	public Rent change(Long rentId, RentForm rentForm) {
		Rent rent = rentRepo.findOne(rentId);
		if (rent==null){
			throw new RuntimeException("no such rent");
		}
		Customer customer = customerRepo.findOne(rentForm.getCustomerId());
		if (customer==null){
			throw new RuntimeException("no such customer");
		}
		
		LuxuryCar car = luxuryCarRepo.findOne(rentForm.getCarId());
		if (car==null){
			throw new RuntimeException("no such car");
		}
		rent.setBegin(rentForm.getBegin());
		rent.setEnd(rentForm.getEnd());
		rent.setCar(car);
		rent.setCustomer(customer);
		
		return rentRepo.save(rent);
	}
	
	public void delete(Long rentId){
		rentRepo.delete(rentId);
	}
}
