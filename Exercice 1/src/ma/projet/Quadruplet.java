
package ma.projet;

import java.util.Objects;

public class Quadruplet<T> {

    private T premier;
    private T second;
    private T troisieme;
    private T quatrieme;

    // Constructeur
    public Quadruplet(T premier, T second,
                      T troisieme, T quatrieme) {
        this.premier = premier;
        this.second = second;
        this.troisieme = troisieme;
        this.quatrieme = quatrieme;
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

    public T getQuatrieme() {
        return quatrieme;
    }

    // Affichage
    public void affiche() {
        System.out.println("Quadruplet : [" + premier + ", "
                + second + ", " + troisieme + ", "
                + quatrieme + "]");
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

        Quadruplet<?> autre = (Quadruplet<?>) obj;

        return Objects.equals(premier, autre.premier)
                && Objects.equals(second, autre.second)
                && Objects.equals(troisieme, autre.troisieme)
                && Objects.equals(quatrieme, autre.quatrieme);
    }

    // HashCode
    @Override
    public int hashCode() {
        return Objects.hash(premier, second,
                troisieme, quatrieme);
    }
}
