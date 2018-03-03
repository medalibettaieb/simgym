package tn.esprit.sim4.simgym.entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import tn.esprit.sim4.simgym.entities.User;

/**
 * Entity implementation class for Entity: Trainer
 *
 */
@Entity

public class Trainer extends User implements Serializable {

	
	private String speciality;
	private static final long serialVersionUID = 1L;

	public Trainer() {
		super();
	}   
	
	public Trainer(String name, String login, String password, String email, String speciality) {
		super(name, login, password, email);
		this.speciality = speciality;
	}

	public String getSpeciality() {
		return this.speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
   
}
