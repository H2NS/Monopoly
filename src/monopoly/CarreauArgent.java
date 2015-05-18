package monopoly;

public class CarreauArgent extends CarreauAction {
	private int _montant;

    public CarreauArgent(int num, String nom, Monopoly mono, int montant) {
        super(num, nom, mono);
        setMontant(montant);
    }

    /**
     * @return the _montant
     */
    public int getMontant() {
        return _montant;
    }

    /**
     * @param _montant the _montant to set
     */
    private void setMontant(int _montant) {
        this._montant = _montant;
    }
}