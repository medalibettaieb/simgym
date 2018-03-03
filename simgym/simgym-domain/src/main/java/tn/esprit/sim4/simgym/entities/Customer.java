package tn.esprit.sim4.simgym.entities;

import java.io.Serializable;
import javax.persistence.*;
import tn.esprit.sim4.simgym.entities.User;

/**
 * Entity implementation class for Entity: Customer
 *
 */
@Entity

public class Customer extends User implements Serializable {

	private UserGender userGender;
	private int age;
	private static final long serialVersionUID = 1L;

	public Customer() {
		super();
	}
	

	public Customer(String name, String login, String password, String email, UserGender userGender, int age) {
		super(name, login, password, email);
		this.userGender = userGender;
		this.age = age;
	}


	public UserGender getUserGender() {
		return userGender;
	}

	public void setUserGender(UserGender userGender) {
		this.userGender = userGender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
   
}
