package tn.esprit.sim4.simgym.entities;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Coach
 *
 */
@Entity

public class Coach extends User implements Serializable {

	private int experienceYears;
	private UserGender userGender;
	private static final long serialVersionUID = 1L;

	public Coach() {
		super();
	}

	public Coach(String name, String login, String password, String email, int experienceYears, UserGender userGender) {
		super(name, login, password, email);
		this.experienceYears = experienceYears;
		this.userGender = userGender;
	}

	public int getExperienceYears() {
		return this.experienceYears;
	}

	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}

	public UserGender getUserGender() {
		return userGender;
	}

	public void setUserGender(UserGender userGender) {
		this.userGender = userGender;
	}

}
