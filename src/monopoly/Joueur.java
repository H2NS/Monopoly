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

    /**
     * @return the _nomJoueur
     */
    public String getNomJoueur() {
        return _nomJoueur;
    }

    /**
     * @param _nomJoueur the _nomJoueur to set
     */
    public void setNomJoueur(String _nomJoueur) {
        this._nomJoueur = _nomJoueur;
    }

    /**
     * @return the _cash
     */
    public int getCash() {
        return _cash;
    }

    /**
     * @param _cash the _cash to set
     */
    public void setCash(int _cash) {
        this._cash = _cash;
    }

    /**
     * @return the _monopoly
     */
    public Monopoly getMonopoly() {
        return _monopoly;
    }

    /**
     * @param _monopoly the _monopoly to set
     */
    public void setMonopoly(Monopoly _monopoly) {
        this._monopoly = _monopoly;
    }

    /**
     * @return the _compagnies
     */
    public ArrayList getCompagnies() {
        return _compagnies;
    }

    /**
     * @param _compagnies the _compagnies to set
     */
    public void setCompagnies(ArrayList _compagnies) {
        this._compagnies = _compagnies;
    }

    /**
     * @return the _gares
     */
    public ArrayList getGares() {
        return _gares;
    }

    /**
     * @param _gares the _gares to set
     */
    public void setGares(ArrayList _gares) {
        this._gares = _gares;
    }

    /**
     * @return the _positionCourante
     */
    public Carreau getPositionCourante() {
        return _positionCourante;
    }

    /**
     * @param _positionCourante the _positionCourante to set
     */
    public void setPositionCourante(Carreau _positionCourante) {
        this._positionCourante = _positionCourante;
    }

    /**
     * @return the _proprietesAConstruire
     */
    public ArrayList getProprietesAConstruire() {
        return _proprietesAConstruire;
    }

    /**
     * @param _proprietesAConstruire the _proprietesAConstruire to set
     */
    public void setProprietesAConstruire(ArrayList _proprietesAConstruire) {
        this._proprietesAConstruire = _proprietesAConstruire;
    }
}