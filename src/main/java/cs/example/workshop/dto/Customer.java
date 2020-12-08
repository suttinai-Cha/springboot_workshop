package cs.example.workshop.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Customer {

	private String name;
	private String lastname;
	private String personalId;
	private Date birthDate;

}