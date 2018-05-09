package tn.esprit.sim4.simgym.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.sim4.simgym.entities.Trainer;
import tn.esprit.sim4.simgym.entities.User;

/**
 * Session Bean implementation class HumainRessourceService
 */
@Stateless
public class HumainRessourceService implements HumainRessourceServiceRemote, HumainRessourceServiceLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public HumainRessourceService() {
	}

	@Override
	public void addUser(User user) {
		entityManager.persist(user);
	}

	@Override
	public void updateUser(User user) {
		entityManager.merge(user);
	}

	@Override
	public void deleteUserById(int id) {
		entityManager.remove(findUserById(id));
	}

	@Override
	public void deleteUser(User user) {
		entityManager.remove(user);
	}

	@Override
	public User findUserById(int id) {
		return entityManager.find(User.class, id);
	}

	@Override
	public List<User> findAllUsers() {
		return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
	}
	
	@Override
	public Trainer findTrainerById(int id) {
		return entityManager.find(Trainer.class, id);
	}


}
