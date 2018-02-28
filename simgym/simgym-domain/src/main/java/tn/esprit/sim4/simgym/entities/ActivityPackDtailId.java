package tn.esprit.sim4.simgym.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class ActivityPackDtailId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idPack;
	private int idActivity;
	private Date dateOfCreation;

	public ActivityPackDtailId() {
	}

	public int getIdPack() {
		return idPack;
	}

	public void setIdPack(int idPack) {
		this.idPack = idPack;
	}

	public int getIdActivity() {
		return idActivity;
	}

	public void setIdActivity(int idActivity) {
		this.idActivity = idActivity;
	}

	public Date getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public ActivityPackDtailId(int idPack, int idActivity) {
		super();
		this.idPack = idPack;
		this.idActivity = idActivity;
		this.dateOfCreation = new Date();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfCreation == null) ? 0 : dateOfCreation.hashCode());
		result = prime * result + idActivity;
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
		ActivityPackDtailId other = (ActivityPackDtailId) obj;
		if (dateOfCreation == null) {
			if (other.dateOfCreation != null)
				return false;
		} else if (!dateOfCreation.equals(other.dateOfCreation))
			return false;
		if (idActivity != other.idActivity)
			return false;
		if (idPack != other.idPack)
			return false;
		return true;
	}

}
