package services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessFactoryBuilder {

	private static SessionFactory sf = null;

	public static void buildFactory() {
		Configuration cfg = new Configuration().configure();
		sf = cfg.buildSessionFactory();

	}
	
	

	public static Session getSess() {
		return sf.openSession();
	}

	public static void closeFactory() {
		sf.close();
	}
}
