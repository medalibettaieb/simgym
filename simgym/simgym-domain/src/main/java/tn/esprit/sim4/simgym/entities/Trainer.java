package tn.esprit.sim4.simgym.entities;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Trainer
 *
 */
@Entity

public class Trainer extends User {
	private static final long serialVersionUID = -558553967080513790L;
	private String speciality;

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
