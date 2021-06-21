package ro.java.ctrln;

public class AutoboxingPrimitives {

    public static void main(String[] args) {

        Integer integerValue = 8; //autoboxing prin asignare
        System.out.println("Integer value: " + integerValue);

        demonstrateAutoboxing(15); //autoboxing prin invocarea unei metode
    }

    public static void demonstrateAutoboxing(Integer parameter) {
        System.out.println("Parameter is: " + parameter);

    }
}
