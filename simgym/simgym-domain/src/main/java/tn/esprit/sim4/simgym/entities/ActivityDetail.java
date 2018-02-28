package tn.esprit.sim4.simgym.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: ActivityDetail
 *
 */
@Entity

public class ActivityDetail implements Serializable {
	@EmbeddedId
	private ActivityDetailId activityDetailId;
	private int nbMinute;
	
	@ManyToOne
	private User trainer;

	@ManyToOne
	@JoinColumn(name = "code", referencedColumnName = "USR_CODE", updatable = false, insertable = false)
	private User user;

	@ManyToOne
	@JoinColumn(name = "idActivity", referencedColumnName = "id", updatable = false, insertable = false)
	private Activity activity;

	private static final long serialVersionUID = 1L;

	public ActivityDetail() {
		super();
	}

	public ActivityDetail(int nbMinute, User user, Activity activity) {
		super();
		this.nbMinute = nbMinute;
		this.user = user;
		this.activity = activity;
		this.activityDetailId=new ActivityDetailId(user.getCode(), activity.getId());
	}

	public ActivityDetail(int nbMinute, User trainer, User user, Activity activity) {
		super();
		this.nbMinute = nbMinute;
		this.trainer = trainer;
		this.user = user;
		this.activity = activity;
		this.activityDetailId=new ActivityDetailId(user.getCode(), activity.getId());
	}

	public ActivityDetailId getActivityDetailId() {
		return activityDetailId;
	}

	public void setActivityDetailId(ActivityDetailId activityDetailId) {
		this.activityDetailId = activityDetailId;
	}

	public int getNbMinute() {
		return this.nbMinute;
	}

	public void setNbMinute(int nbMinute) {
		this.nbMinute = nbMinute;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	public User getTrainer() {
		return trainer;
	}

	public void setTrainer(User trainer) {
		this.trainer = trainer;
	}

}
