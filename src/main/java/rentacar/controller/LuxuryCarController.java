package rentacar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import rentacar.domain.LuxuryCar;
import rentacar.repo.LuxuryCarRepo;

@RestController
@RequestMapping("/car")
public class LuxuryCarController {

	@Autowired
	private LuxuryCarRepo luxuryCarRepo;
	
	@GetMapping("/add")
	public @ResponseBody String addNewCar(@RequestParam(value="brand", required=true) String brand
							,@RequestParam(value="model", required=true) String model
							,@RequestParam(value="type", required=false, defaultValue="sedan") String type
							,@RequestParam(value="mileage", required=false, defaultValue="0") int mileage
							,@RequestParam(value="seats", required=false, defaultValue="2") int numberOfSeats
							,@RequestParam(value="doors", required=false, defaultValue="2") int numberOfDoors
							,@RequestParam(value="ac", required=false, defaultValue="false") boolean hasAC
							,@RequestParam(value="power", required=false, defaultValue="0") int enginePower
							,@RequestParam(value="autoGear", required=false, defaultValue="false") boolean hasAutomaticTransmission ){
		
		LuxuryCar car = new LuxuryCar();
		car.setBrand(brand);
		car.setModel(model);
		car.setType(type);
		car.setMileage(mileage);
		car.setNumberOfSeats(numberOfSeats);
		car.setNumberOfDoors(numberOfDoors);
		car.setHasAC(hasAC);
		car.setEnginePower(enginePower);
		car.setHasAutomaticTransmission(hasAutomaticTransmission);
		luxuryCarRepo.save(car);
		return "New car added";
	}
	@GetMapping("/all")						
	public Iterable<LuxuryCar> getAllCars(){
		return luxuryCarRepo.findAll();
	}
}
