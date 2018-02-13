package tn.esprit.sim4.simgym.services;

import javax.ejb.Remote;

import tn.esprit.sim4.simgym.entities.User;
import tn.esprit.sim4.simgym.utilities.IGenericDAO;

@Remote
public interface UserServiceRemote extends IGenericDAO<User> {

}
