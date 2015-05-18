package monopoly;

public abstract class CarreauPropriete extends Carreau {
	private int _loyerBase;
	private int _prixAchat;
	private Joueur _proprietaire;

    public CarreauPropriete(int num, String nom, Monopoly mono) {
        super(num, nom, mono);
    }

    /**
     * @return the _loyerBase
     */
    public int getLoyerBase() {
        return _loyerBase;
    }

    /**
     * @param _loyerBase the _loyerBase to set
     */
    public void setLoyerBase(int _loyerBase) {
        this._loyerBase = _loyerBase;
    }

    /**
     * @return the _prixAchat
     */
    public int getPrixAchat() {
        return _prixAchat;
    }

    /**
     * @param _prixAchat the _prixAchat to set
     */
    public void setPrixAchat(int _prixAchat) {
        this._prixAchat = _prixAchat;
    }

    /**
     * @return the _proprietaire
     */
    public Joueur getProprietaire() {
        return _proprietaire;
    }

    /**
     * @param _proprietaire the _proprietaire to set
     */
    public void setProprietaire(Joueur _proprietaire) {
        this._proprietaire = _proprietaire;
    }
}