package rentacar.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import rentacar.bean.RentForm;
import rentacar.domain.Rent;
import rentacar.service.RentService;

@RestController
@RequestMapping("/rent")
public class RentController {

	@Autowired
	private RentService rentService;
	
	@PostMapping(path="/new", consumes={MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody ResponseEntity<Rent> addNewRent(@RequestBody @Valid RentForm rentForm ){
		return ResponseEntity.ok(rentService.rent(rentForm));
	}
	
	@PutMapping(path="/change/{rentId}", consumes={MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody ResponseEntity<Rent> change(@RequestBody @Valid RentForm rentForm, @PathVariable("rentId")Long rentId ){
		return ResponseEntity.ok(rentService.change(rentId,rentForm));
	}
	@DeleteMapping(path="/delete/{rentId}", consumes={MediaType.APPLICATION_JSON_VALUE})
	public @ResponseBody ResponseEntity<Void> delete(@PathVariable("rentId")Long rentId ){
		rentService.delete(rentId);
		return ResponseEntity.ok().build();
	}
}
