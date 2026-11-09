
package ma.projet;

import java.util.Arrays;
import java.util.List;

public class TripletH<A, B, C> {

    private final A premier;
    private final B second;
    private final C troisieme;

    // Constructeur
    public TripletH(A premier, B second, C troisieme) {
        this.premier = premier;
        this.second = second;
        this.troisieme = troisieme;
    }

    // Getters
    public A getPremier() {
        return premier;
    }

    public B getSecond() {
        return second;
    }

    public C getTroisieme() {
        return troisieme;
    }

    // Affichage
    public void affiche() {
        System.out.println("TripletH : [" + premier + ", "
                + second + ", " + troisieme + "]");
    }

    // Transformer les éléments en liste
    public List<Object> toList() {
        return Arrays.asList(premier, second, troisieme);
    }
}
