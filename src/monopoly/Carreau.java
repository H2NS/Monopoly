package monopoly;

public abstract class Carreau {
	private int _numero;
	private String _nomCarreau;
	private Monopoly _monopoly;

    /**
     * @return the _numero
     */
    public int getNumero() {
        return _numero;
    }

    /**
     * @param _numero the _numero to set
     */
    public void setNumero(int _numero) {
        this._numero = _numero;
    }

    /**
     * @return the _nomCarreau
     */
    public String getNomCarreau() {
        return _nomCarreau;
    }

    /**
     * @param _nomCarreau the _nomCarreau to set
     */
    public void setNomCarreau(String _nomCarreau) {
        this._nomCarreau = _nomCarreau;
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
}