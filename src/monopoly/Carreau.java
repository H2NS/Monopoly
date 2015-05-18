package monopoly;

public abstract class Carreau {
	private int _numero;
	private String _nomCarreau;
	private Monopoly _monopoly;

        public Carreau(int num, String nom, Monopoly mono){
		setNumero(num);
		setNomCarreau(nom);
		setMonopoly(mono);		
	}
        
    /**
     * @return the _numero
     */
    private int getNumero() {
        return _numero;
    }

    /**
     * @param _numero the _numero to set
     */
    private void setNumero(int _numero) {
        this._numero = _numero;
    }

    /**
     * @return the _nomCarreau
     */
    private String getNomCarreau() {
        return _nomCarreau;
    }

    /**
     * @param _nomCarreau the _nomCarreau to set
     */
    private void setNomCarreau(String _nomCarreau) {
        this._nomCarreau = _nomCarreau;
    }

    /**
     * @return the _monopoly
     */
    private Monopoly getMonopoly() {
        return _monopoly;
    }

    /**
     * @param _monopoly the _monopoly to set
     */
    private void setMonopoly(Monopoly _monopoly) {
        this._monopoly = _monopoly;
    }
}