package tn.esprit.sim4.simgym.services;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.sim4.simgym.entities.User;

@Local
public interface HumainRessourceServiceLocal {
	void addUser(User user);

	void updateUser(User user);

	void deleteUserById(int id);

	void deleteUser(User user);

	User findUserById(int id);

	List<User> findAllUsers();
}
