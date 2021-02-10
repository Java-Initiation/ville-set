import java.util.Comparator;
import java.util.HashSet;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        HashSet<Pays> pays = new HashSet<>();
        pays.add(new Pays("USA", 434334, 344));
        pays.add(new Pays("France", 123132, 222));
        pays.add(new Pays("Espagne", 2321, 111));
        pays.add(new Pays("Russie", 112123, 1233));
        pays.add(new Pays("Norvege", 23232323, 4332));

        Pays richerCountry = pays.stream().max(Comparator.comparingInt(Pays::getPibHabitants)).get();
        Pays pibTotalPlusIm = pays.stream().max(Comparator.comparingInt(ville -> (ville.getPibHabitants() * ville.getNbHabitants()))).get();

        Pays lowerPibTotalCountry = pays.stream().min(Comparator.comparingInt(o -> o.getPibHabitants() * o.getNbHabitants())).get();
        pays.remove(lowerPibTotalCountry);
        lowerPibTotalCountry.setNom(lowerPibTotalCountry.getNom().toUpperCase(Locale.ROOT));
        pays.add(lowerPibTotalCountry);

        for (Pays pay : pays) {
            System.out.println(pay);
        }

    }

}
