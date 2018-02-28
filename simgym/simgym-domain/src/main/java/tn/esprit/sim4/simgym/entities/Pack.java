package tn.esprit.sim4.simgym.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Pack
 *
 */
@Entity

public class Pack implements Serializable {

	   
	@Id
	private int id;
	private String name;
	
	@OneToMany(mappedBy="pack")
	private List<SubscriptionDetail> subscriptionDetails;
	
	@OneToMany(mappedBy="pack")
	private List<ActivityPackDtail> activityPackDtails;
	
 	private static final long serialVersionUID = 1L;

	public Pack() {
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
	public List<SubscriptionDetail> getSubscriptionDetails() {
		return subscriptionDetails;
	}
	public void setSubscriptionDetails(List<SubscriptionDetail> subscriptionDetails) {
		this.subscriptionDetails = subscriptionDetails;
	}
   
}
