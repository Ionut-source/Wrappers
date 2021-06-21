package ro.java.ctrln;

public class Unboxing {

    public static void main(String[] args) {

        Character character = 'a';
        char charVariable = character; //unboxing prin asignare
        System.out.println("Character is: " + character);

        Integer integer = 100;
        System.out.println("integer is: " + integer);

        float floatValue = integer.floatValue();
        System.out.println("float is: " + integer.floatValue());

        long longValue = integer.longValue();
        System.out.println("long is: " + integer.longValue());





    }

}
