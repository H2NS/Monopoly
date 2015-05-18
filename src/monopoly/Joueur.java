package monopoly;

import java.util.ArrayList;

public class Joueur {
	private String _nomJoueur;
	private int _cash = 1500;
	private Monopoly _monopoly;
	private ArrayList _compagnies = new ArrayList();
	private ArrayList _gares = new ArrayList();
	private Carreau _positionCourante;
	private ArrayList _proprietesAConstruire = new ArrayList();
}