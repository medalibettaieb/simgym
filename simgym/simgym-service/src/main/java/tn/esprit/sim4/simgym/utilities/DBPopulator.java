package tn.esprit.sim4.simgym.utilities;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import tn.esprit.sim4.simgym.entities.Coach;
import tn.esprit.sim4.simgym.entities.Customer;
import tn.esprit.sim4.simgym.entities.Trainer;
import tn.esprit.sim4.simgym.entities.User;
import tn.esprit.sim4.simgym.entities.UserGender;
import tn.esprit.sim4.simgym.services.UserServiceLocal;

@Singleton
@Startup
public class DBPopulator {
	@EJB
	private UserServiceLocal userServiceLocal;
	@EJB
	private RandomGenerator randomGenerator;

	public DBPopulator() {
	}

	@PostConstruct
	public void init() {
		Customer customer = new Customer("customer1", "c1", randomGenerator.generate(), "customer1@esprit.tn",
				UserGender.FEMALE, 20);
		Customer customer2 = new Customer("customer2", "c2", randomGenerator.generate(), "customer2@esprit.tn",
				UserGender.MALE, 23);
		Customer customer3 = new Customer("customer3", "c3", randomGenerator.generate(), "customer3@esprit.tn",
				UserGender.FEMALE, 18);
		Customer customer4 = new Customer("customer4", "c4", randomGenerator.generate(), "customer4@esprit.tn",
				UserGender.MALE, 30);

		Trainer trainer = new Trainer("trainer1", "t1", randomGenerator.generate(), "trainer1@esprit.tn", "zomba");
		Trainer trainer2 = new Trainer("trainer2", "t2", randomGenerator.generate(), "trainer2@esprit.tn", "RPM");

		Coach coach = new Coach("coach1", "co1", randomGenerator.generate(), "coach1@esprit.tn", 1, UserGender.MALE);
		Coach coach2 = new Coach("coach2", "co2", randomGenerator.generate(), "coach2@esprit.tn", 2, UserGender.FEMALE);
		Coach coach3 = new Coach("coach3", "co3", randomGenerator.generate(), "coach3@esprit.tn", 3, UserGender.MALE);

		User user = new User("user", "u", randomGenerator.generate(), "user@bitbox.tn");

		userServiceLocal.update(user);
		userServiceLocal.update(customer);
		userServiceLocal.update(customer2);
		userServiceLocal.update(customer3);
		userServiceLocal.update(customer4);
		userServiceLocal.update(trainer);
		userServiceLocal.update(trainer2);
		userServiceLocal.update(coach);
		userServiceLocal.update(coach2);
		userServiceLocal.update(coach3);
	}
}
