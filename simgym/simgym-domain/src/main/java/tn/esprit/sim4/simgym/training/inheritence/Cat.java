package tn.esprit.sim4.simgym.training.inheritence;

import java.io.Serializable;
import javax.persistence.*;
import tn.esprit.sim4.simgym.training.inheritence.Animal;

/**
 * Entity implementation class for Entity: Cat
 *
 */
@Entity

public class Cat extends Animal implements Serializable {

	private String color;
	private static final long serialVersionUID = 1L;

	public Cat() {
		super();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
   
}
