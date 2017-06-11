package rentacar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import rentacar.domain.Customer;
import rentacar.repo.CustomerRepo;


@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerRepo customerRepo;
	
	@GetMapping(path="/add")
	public @ResponseBody String addNewCustomer(@RequestParam String name, @RequestParam String phone){
		Customer c = new Customer();
		c.setName(name);
		c.setPhone(phone);
		customerRepo.save(c);
		String odp = "Dodano";
		return odp;
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Customer> getAllCustomers(){
		return customerRepo.findAll();
	}
}
