package rentacar.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import rentacar.domain.LuxuryCar;
import rentacar.repo.LuxuryCarRepo;

@RestController
@RequestMapping("/car")
public class LuxuryCarController {

	@Autowired
	private LuxuryCarRepo luxuryCarRepo;
	
	@PostMapping(path="/add", consumes={"application/JSON" })
	public @ResponseBody String addNewCar(@RequestBody @Valid LuxuryCar car){
		luxuryCarRepo.save(car);
		return "New car added";
	}
	
	@GetMapping("/all")						
	public Iterable<LuxuryCar> getAllCars(){
		return luxuryCarRepo.findAll();
	}
}
