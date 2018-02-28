package tn.esprit.sim4.simgym.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class SubscriptionDetailId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long code;
	private int idPack;
	private Date dateOfSubscription;
	public SubscriptionDetailId() {
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public int getIdPack() {
		return idPack;
	}
	public void setIdPack(int idPack) {
		this.idPack = idPack;
	}
	public Date getDateOfSubscription() {
		return dateOfSubscription;
	}
	public void setDateOfSubscription(Date dateOfSubscription) {
		this.dateOfSubscription = dateOfSubscription;
	}
	public SubscriptionDetailId(Long code, int idPack) {
		super();
		this.code = code;
		this.idPack = idPack;
		this.dateOfSubscription=new Date();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((dateOfSubscription == null) ? 0 : dateOfSubscription.hashCode());
		result = prime * result + idPack;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SubscriptionDetailId other = (SubscriptionDetailId) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (dateOfSubscription == null) {
			if (other.dateOfSubscription != null)
				return false;
		} else if (!dateOfSubscription.equals(other.dateOfSubscription))
			return false;
		if (idPack != other.idPack)
			return false;
		return true;
	}
	
	
	

}
