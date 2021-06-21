package ro.java.ctrln;

public class UnboxingWrappers {

    public static void main(String[] args) {
        Double doubleNumber = 2.75;
        double d = doubleNumber; // unboxing prin asignare
        System.out.println("Unboxed primitive: " + d);

        demonstrateUnboxing(new Double(3.15)); // unboxing prin apel de metoda

        Double nullDouble = populateDoubleValue(5,3);
        if (nullDouble == null) {
            nullDouble = 8.0;
        }
        demonstrateUnboxing(nullDouble);

       //nullDouble = populateDoubleValue(-5,10);
       //demonstrateUnboxing(nullDouble);

    }

    private static Double populateDoubleValue(int a, int b) {
        if (a<0) {
            return null;
        }
        return (double)(a + b); // Java face autoboxing de la o primitiva double catre un obiect Double
    }

    private static void demonstrateUnboxing(double aDouble) {
        System.out.println("double primitive value: " + aDouble);
    }
}
