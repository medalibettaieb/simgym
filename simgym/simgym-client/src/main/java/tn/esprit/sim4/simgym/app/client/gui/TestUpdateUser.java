package tn.esprit.sim4.simgym.app.client.gui;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.sim4.simgym.entities.Trainer;
import tn.esprit.sim4.simgym.services.HumainRessourceServiceRemote;

public class TestUpdateUser {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		HumainRessourceServiceRemote proxy = (HumainRessourceServiceRemote) context.lookup(
				"simgym-ear/simgym-service/HumainRessourceService!tn.esprit.sim4.simgym.services.HumainRessourceServiceRemote");

		Trainer trainer=(Trainer) proxy.findUserById(11);
		trainer.setSpeciality("chou3a3 ghreab");
		
		proxy.updateUser(trainer);
	}

}
