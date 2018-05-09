package tn.esprit.sim4.simgym.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="T_USER")
public class User implements Serializable{
	private static final long serialVersionUID = 6529685098267757690L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USR_CODE")
	private int code;
	@Column(name = "USR_NAME")
	private String name;
	@Column(name = "USR_LOGIN")
	private String login;
	@Column(name = "USR_PWD")
	private String password;
	@Column(name = "USR_EMAIL")
	private String email;

	@ManyToMany(mappedBy = "usersSubscribedIn")
	private List<Session> sessionsSubscribedIn;

	@OneToMany(mappedBy = "trainer")
	private List<Session> sessionsTrained;

	@OneToMany(mappedBy = "user")
	private List<ActivityDetail> activityDetails;

	@OneToMany(mappedBy = "trainer")
	private List<ActivityDetail> activityDetailsByCoach;

	@OneToMany(mappedBy = "user")
	private List<SubscriptionDetail> subscriptionDetails;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User() {
		super();
	}

	public User(String name, String login, String password, String email) {
		super();
		this.name = name;
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public List<Session> getSessionsSubscribedIn() {
		return sessionsSubscribedIn;
	}

	public void setSessionsSubscribedIn(List<Session> sessionsSubscribedIn) {
		this.sessionsSubscribedIn = sessionsSubscribedIn;
	}

	public List<Session> getSessionsTrained() {
		return sessionsTrained;
	}

	public void setSessionsTrained(List<Session> sessionsTrained) {
		this.sessionsTrained = sessionsTrained;
	}

	public List<ActivityDetail> getActivityDetails() {
		return activityDetails;
	}

	public void setActivityDetails(List<ActivityDetail> activityDetails) {
		this.activityDetails = activityDetails;
	}

	public List<ActivityDetail> getActivityDetailsByCoach() {
		return activityDetailsByCoach;
	}

	public void setActivityDetailsByCoach(List<ActivityDetail> activityDetailsByCoach) {
		this.activityDetailsByCoach = activityDetailsByCoach;
	}

	public List<SubscriptionDetail> getSubscriptionDetails() {
		return subscriptionDetails;
	}

	public void setSubscriptionDetails(List<SubscriptionDetail> subscriptionDetails) {
		this.subscriptionDetails = subscriptionDetails;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
