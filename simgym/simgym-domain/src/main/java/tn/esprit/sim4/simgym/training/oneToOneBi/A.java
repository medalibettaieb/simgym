package tn.esprit.sim4.simgym.training.oneToOneBi;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class A implements Serializable {
	@Id
	private int idA;
	
	@OneToOne
	private B b;
	

	private static final long serialVersionUID = 1L;

	public A() {
	}

	public int getIdA() {
		return idA;
	}

	public void setIdA(int idA) {
		this.idA = idA;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

}
