package tn.esprit.sim4.simgym.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Activity
 *
 */
@Entity

public class Activity implements Serializable {

	@Id
	private int id;
	private String name;

	@OneToMany(mappedBy = "activity")
	private List<ActivityDetail> activityDetails;

	@OneToMany(mappedBy = "activity")
	private List<ActivityPackDtail> activityPackDtails;

	private static final long serialVersionUID = 1L;

	public Activity() {
		super();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ActivityDetail> getActivityDetails() {
		return activityDetails;
	}

	public void setActivityDetails(List<ActivityDetail> activityDetails) {
		this.activityDetails = activityDetails;
	}

	public List<ActivityPackDtail> getActivityPackDtails() {
		return activityPackDtails;
	}

	public void setActivityPackDtails(List<ActivityPackDtail> activityPackDtails) {
		this.activityPackDtails = activityPackDtails;
	}

}
