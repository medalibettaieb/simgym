package tn.esprit.sim4.simgym.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Session
 *
 */
@Entity

public class Session implements Serializable {

	@Id
	private int id;
	private Date dateOfSession;

	@ManyToOne
	private Course course;

	@ManyToOne
	private User trainer;

	@ManyToMany
	private List<User> usersSubscribedIn;
	private static final long serialVersionUID = 1L;

	public Session() {
		super();
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateOfSession() {
		return this.dateOfSession;
	}

	public void setDateOfSession(Date dateOfSession) {
		this.dateOfSession = dateOfSession;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public User getTrainer() {
		return trainer;
	}

	public void setTrainer(User trainer) {
		this.trainer = trainer;
	}

	public List<User> getUsersSubscribedIn() {
		return usersSubscribedIn;
	}

	public void setUsersSubscribedIn(List<User> usersSubscribedIn) {
		this.usersSubscribedIn = usersSubscribedIn;
	}

}
