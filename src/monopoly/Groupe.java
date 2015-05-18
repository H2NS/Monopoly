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
    public int getPrixAchatMaison() {
        return _prixAchatMaison;
    }

    /**
     * @param _prixAchatMaison the _prixAchatMaison to set
     */
    public void setPrixAchatMaison(int _prixAchatMaison) {
        this._prixAchatMaison = _prixAchatMaison;
    }

    /**
     * @return the _prixAchatHotel
     */
    public int getPrixAchatHotel() {
        return _prixAchatHotel;
    }

    /**
     * @param _prixAchatHotel the _prixAchatHotel to set
     */
    public void setPrixAchatHotel(int _prixAchatHotel) {
        this._prixAchatHotel = _prixAchatHotel;
    }

    /**
     * @return the _couleur
     */
    public CouleurPropriete getCouleur() {
        return _couleur;
    }

    /**
     * @param _couleur the _couleur to set
     */
    public void setCouleur(CouleurPropriete _couleur) {
        this._couleur = _couleur;
    }

    /**
     * @return the _proprietes
     */
    public ArrayList getProprietes() {
        return _proprietes;
    }

    /**
     * @param _proprietes the _proprietes to set
     */
    public void setProprietes(ArrayList _proprietes) {
        this._proprietes = _proprietes;
    }
}