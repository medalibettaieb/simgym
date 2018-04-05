package tn.esprit.sim4.simgym.app.client.gui;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.esprit.sim4.simgym.entities.Coach;
import tn.esprit.sim4.simgym.entities.Trainer;
import tn.esprit.sim4.simgym.entities.UserGender;
import tn.esprit.sim4.simgym.services.HumainRessourceServiceRemote;

public class TestAddUser {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		HumainRessourceServiceRemote proxy = (HumainRessourceServiceRemote) context.lookup(
				"simgym-ear/simgym-service/HumainRessourceService!tn.esprit.sim4.simgym.services.HumainRessourceServiceRemote");

		Trainer trainer = new Trainer("ahmed", "ah", "ah", "my@sql", "DBA");
		Coach coach = new Coach("rchouda", "rch", "rch", "oracle@sql", 10, UserGender.MALE);

		proxy.addUser(trainer);
		proxy.addUser(coach);
	}

}
