package cs.example.workshop.controler;

import org.springframework.web.bind.annotation.RestController;

import cs.example.workshop.dto.Customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController()
@RequestMapping("/customers/v1")
public class CustomerController {

	@GetMapping(path = {""}, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getCustomer(@RequestParam(value = "personalId" , required = false) String personnalId) {
		List<Customer> result = new ArrayList<Customer>();
		/**
		 * TODO call service for get customers
		 */
		return result;
	}

}