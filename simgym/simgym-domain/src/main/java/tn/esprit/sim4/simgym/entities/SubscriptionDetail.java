package tn.esprit.sim4.simgym.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: SubscriptionDetail
 *
 */
@Entity

public class SubscriptionDetail implements Serializable {
	@EmbeddedId
	private SubscriptionDetailId subscriptionDetailId;
	private boolean status;

	@ManyToOne
	@JoinColumn(name = "code", referencedColumnName = "USR_CODE", updatable = false, insertable = false)
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "idPack", referencedColumnName = "id", updatable = false, insertable = false)
	private Pack pack;

	private static final long serialVersionUID = 1L;

	public SubscriptionDetail() {
		super();
	}

	public boolean getStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public SubscriptionDetailId getSubscriptionDetailId() {
		return subscriptionDetailId;
	}

	public void setSubscriptionDetailId(SubscriptionDetailId subscriptionDetailId) {
		this.subscriptionDetailId = subscriptionDetailId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Pack getPack() {
		return pack;
	}

	public void setPack(Pack pack) {
		this.pack = pack;
	}

}
