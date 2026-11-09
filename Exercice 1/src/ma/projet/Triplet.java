
package ma.projet;

import java.util.Objects;

public class Triplet<T> {

    private T premier;
    private T second;
    private T troisieme;

    // Constructeur
    public Triplet(T premier, T second, T troisieme) {
        this.premier = premier;
        this.second = second;
        this.troisieme = troisieme;
    }

    // Getters
    public T getPremier() {
        return premier;
    }

    public T getSecond() {
        return second;
    }

    public T getTroisieme() {
        return troisieme;
    }

    // Affichage
    public void affiche() {
        System.out.println("Triplet : [" + premier + ", "
                + second + ", " + troisieme + "]");
    }

    // Échanger premier et second
    public void swap() {
        T temp = premier;
        premier = second;
        second = temp;
    }

    // Comparaison
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Triplet<?> autre = (Triplet<?>) obj;

        return Objects.equals(premier, autre.premier)
                && Objects.equals(second, autre.second)
                && Objects.equals(troisieme, autre.troisieme);
    }

    // HashCode
    @Override
    public int hashCode() {
        return Objects.hash(premier, second, troisieme);
    }
}
