package monopoly;

public class ProprieteAConstruire extends CarreauPropriete {
	private int _nbMaisons = 0;
	private int _nbHotels = 0;
	private java.util.ArrayList _loyerMaison;
	private Groupe _groupePropriete;

    public ProprieteAConstruire(int num, String nom, Monopoly mono) {
        super(num, nom, mono);
    }

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
     * @return the _loyerMaison
     */
    private java.util.ArrayList getLoyerMaison() {
        return _loyerMaison;
    }

    /**
     * @param _loyerMaison the _loyerMaison to set
     */
    private void setLoyerMaison(java.util.ArrayList _loyerMaison) {
        this._loyerMaison = _loyerMaison;
    }

    /**
     * @return the _groupePropriete
     */
    private Groupe getGroupePropriete() {
        return _groupePropriete;
    }

    /**
     * @param _groupePropriete the _groupePropriete to set
     */
    private void setGroupePropriete(Groupe _groupePropriete) {
        this._groupePropriete = _groupePropriete;
    }
}