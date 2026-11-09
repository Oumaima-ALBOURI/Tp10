
package ma.projet;

import java.util.List;

public class TestTripletH {

    public static void main(String[] args) {

        // Triplet hétérogène : Integer, String, Double
        TripletH<Integer, String, Double> th =
                new TripletH<>(42, "Answer", 3.14);

        th.affiche();

        // Triplet : String, Integer, Boolean
        TripletH<String, Integer, Boolean> th2 =
                new TripletH<>("Alice", 30, true);

        th2.affiche();

        // Tester les getters
        System.out.println("Premier : " + th.getPremier());
        System.out.println("Second : " + th.getSecond());
        System.out.println("Troisième : " + th.getTroisieme());

        // Tester toList()
        List<Object> liste = th.toList();

        System.out.println("Liste : " + liste);
    }
}
