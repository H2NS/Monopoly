package monopoly;

import java.util.ArrayList;

public class Monopoly {
	private int _nbMaisons = 32;
	private int _nbHotels = 12;
	private Carreau _carreaux;
	private ArrayList _joueurs = new ArrayList();
	private Interface _interface_3;

    /**
     * @return the _nbMaisons
     */
    private int getNbMaisons() {
        return _nbMaisons;
    }

    /**
     * @param _nbMaisons the _nbMaisons to set
     */
    private void setNbMaisons(int _nbMaisons) {
        this._nbMaisons = _nbMaisons;
    }

    /**
     * @return the _nbHotels
     */
    private int getNbHotels() {
        return _nbHotels;
    }

    /**
     * @param _nbHotels the _nbHotels to set
     */
    private void setNbHotels(int _nbHotels) {
        this._nbHotels = _nbHotels;
    }

    /**
     * @return the _carreaux
     */
    private Carreau getCarreaux() {
        return _carreaux;
    }

    /**
     * @param _carreaux the _carreaux to set
     */
    private void setCarreaux(Carreau _carreaux) {
        this._carreaux = _carreaux;
    }

    /**
     * @return the _joueurs
     */
    private ArrayList getJoueurs() {
        return _joueurs;
    }

    /**
     * @param _joueurs the _joueurs to set
     */
    private void setJoueurs(ArrayList _joueurs) {
        this._joueurs = _joueurs;
    }

    /**
     * @return the _interface_3
     */
    private Interface getInterface_3() {
        return _interface_3;
    }

    /**
     * @param _interface_3 the _interface_3 to set
     */
    private void setInterface_3(Interface _interface_3) {
        this._interface_3 = _interface_3;
    }
}