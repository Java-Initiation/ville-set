public class Pays {

    private String nom;
    private int nbHabitants;
    private int pibHabitants;

    public Pays(String nom, int nbHabitants, int pibHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.pibHabitants = pibHabitants;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    public int getPibHabitants() {
        return pibHabitants;
    }

    public void setPibHabitants(int pibHabitants) {
        this.pibHabitants = pibHabitants;
    }

    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", nbHabitants=" + nbHabitants +
                ", pibHabitants=" + pibHabitants +
                '}';
    }
}
