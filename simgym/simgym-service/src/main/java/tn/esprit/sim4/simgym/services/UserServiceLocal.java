package tn.esprit.sim4.simgym.services;

import javax.ejb.Local;

import tn.esprit.sim4.simgym.entities.User;
import tn.esprit.sim4.simgym.utilities.IGenericDAO;

@Local
public interface UserServiceLocal extends IGenericDAO<User> {

	User login(String login, String password);

}
