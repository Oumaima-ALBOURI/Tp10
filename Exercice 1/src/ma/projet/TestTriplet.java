
package ma.projet;

public class TestTriplet {

    public static void main(String[] args) {

        // Triplet d'entiers
        Triplet<Integer> tInt = new Triplet<>(1, 2, 3);
        tInt.affiche();

        // Triplet de chaînes
        Triplet<String> tStr =
                new Triplet<>("A", "B", "C");
        tStr.affiche();

        // Tester les getters
        System.out.println("Deuxième élément : "
                + tInt.getSecond());

        // Tester swap
        tInt.swap();
        System.out.println("Après swap :");
        tInt.affiche();

        // Tester equals
        Triplet<Integer> t2 = new Triplet<>(2, 1, 3);
        System.out.println("Égaux ? " + tInt.equals(t2));

        // Tester hashCode
        System.out.println("HashCode : " + tInt.hashCode());

        // Quadruplet
        Quadruplet<Integer> q =
                new Quadruplet<>(1, 2, 3, 4);

        q.affiche();

        q.swap();
        System.out.println("Après swap :");
        q.affiche();
    }
}
