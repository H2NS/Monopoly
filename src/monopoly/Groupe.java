package monopoly;

import java.util.ArrayList;

public class Groupe {
	private int _prixAchatMaison;
	private int _prixAchatHotel;
	private CouleurPropriete _couleur;
	private ArrayList _proprietes = new ArrayList();

    /**
     * @return the _prixAchatMaison
     */
    private int getPrixAchatMaison() {
        return _prixAchatMaison;
    }

    /**
     * @param _prixAchatMaison the _prixAchatMaison to set
     */
    private void setPrixAchatMaison(int _prixAchatMaison) {
        this._prixAchatMaison = _prixAchatMaison;
    }

    /**
     * @return the _prixAchatHotel
     */
    private int getPrixAchatHotel() {
        return _prixAchatHotel;
    }

    /**
     * @param _prixAchatHotel the _prixAchatHotel to set
     */
    private void setPrixAchatHotel(int _prixAchatHotel) {
        this._prixAchatHotel = _prixAchatHotel;
    }

    /**
     * @return the _couleur
     */
    private CouleurPropriete getCouleur() {
        return _couleur;
    }

    /**
     * @param _couleur the _couleur to set
     */
    private void setCouleur(CouleurPropriete _couleur) {
        this._couleur = _couleur;
    }

    /**
     * @return the _proprietes
     */
    private ArrayList getProprietes() {
        return _proprietes;
    }

    /**
     * @param _proprietes the _proprietes to set
     */
    private void setProprietes(ArrayList _proprietes) {
        this._proprietes = _proprietes;
    }
}