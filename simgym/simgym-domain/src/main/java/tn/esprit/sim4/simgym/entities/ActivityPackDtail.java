package tn.esprit.sim4.simgym.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: ActivityPackDtail
 *
 */
@Entity

public class ActivityPackDtail implements Serializable {

	@EmbeddedId
	private ActivityPackDtailId activityPackDtailId;
	private int nbMinute;

	@ManyToOne
	@JoinColumn(name = "idPack", referencedColumnName = "id", updatable = false, insertable = false)
	private Pack pack;

	@ManyToOne
	@JoinColumn(name = "idActivity", referencedColumnName = "id", updatable = false, insertable = false)
	private Activity activity;
	private static final long serialVersionUID = 1L;

	public ActivityPackDtail() {
		super();
	}

	public ActivityPackDtail(int nbMinute, Pack pack, Activity activity) {
		super();
		this.nbMinute = nbMinute;
		this.pack = pack;
		this.activity = activity;
		this.activityPackDtailId=new ActivityPackDtailId(pack.getId(), activity.getId());
	}

	public int getNbMinute() {
		return this.nbMinute;
	}

	public void setNbMinute(int nbMinute) {
		this.nbMinute = nbMinute;
	}

	public ActivityPackDtailId getActivityPackDtailId() {
		return activityPackDtailId;
	}

	public void setActivityPackDtailId(ActivityPackDtailId activityPackDtailId) {
		this.activityPackDtailId = activityPackDtailId;
	}

	public Pack getPack() {
		return pack;
	}

	public void setPack(Pack pack) {
		this.pack = pack;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}

}
