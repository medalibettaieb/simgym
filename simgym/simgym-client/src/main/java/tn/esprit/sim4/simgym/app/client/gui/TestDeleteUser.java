package tn.esprit.sim4.simgym.app.client.gui;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.sim4.simgym.entities.User;
import tn.esprit.sim4.simgym.services.HumainRessourceServiceRemote;

public class TestDeleteUser {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		HumainRessourceServiceRemote proxy = (HumainRessourceServiceRemote) context.lookup(
				"simgym-ear/simgym-service/HumainRessourceService!tn.esprit.sim4.simgym.services.HumainRessourceServiceRemote");

		User user=proxy.findUserById(11);
		proxy.deleteUser(user);
	}

}
