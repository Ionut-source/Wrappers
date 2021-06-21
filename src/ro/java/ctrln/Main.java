package ro.java.ctrln;

public class Main {

    public static void main(String[] args) {
	 Byte byteObject = new Byte((byte) 4);
        System.out.println("Byte: " + byteObject);

        Byte aByte = new Byte("5");
        System.out.println("Byte: " + aByte);


        byte byteVariable = 7;
        Byte bByte = Byte.valueOf(byteVariable);
        System.out.println("Byte: " + bByte);

        Byte cByte = Byte.valueOf("10");
        System.out.println("Byte: " + cByte);

        Byte dByte = 20;
        System.out.println("Byte: " + dByte);

        Short shortObject = new Short("7");
        System.out.println("Short: " + shortObject);
        short shortVar = 50;
        short aShort = Short.valueOf(shortVar);
        Short bshort = 50;

        Integer integer = new Integer(70);
        System.out.println("Integer: " + integer);
        Integer aInteger = 80; //autoboxing prin initializare

        Long longObject = 1000L;
        System.out.println("Long: " + longObject);
        Long aLong = Long.valueOf("50");
        System.out.println("Long: " + aLong);

        Float floatObject = Float.valueOf("50.0");
        System.out.println("Float: " + floatObject);

        Double doubleObject = new Double(500);
        System.out.println("Double: " + doubleObject);

        Character character = new Character('u');
        System.out.println("Character: " + character);

        Character aCharacter = 'z';
        System.out.println("Character: " + aCharacter);

        Boolean booleanObject = true; //autoboxing prin asignare / initializare
        System.out.println("Boolean: " + booleanObject);

        Boolean aBoolean = Boolean.valueOf("");
        System.out.println("Boolean with empty string: " + aBoolean);

        aBoolean = Boolean.valueOf(null);
        System.out.println("Boolean with null to valueOf: " + aBoolean);

        aBoolean = Boolean.valueOf("False");
        System.out.println("Boolean with False: " + aBoolean);

        aBoolean = Boolean.valueOf("True");
        System.out.println("Boolean with True: " + aBoolean);

        aBoolean = new Boolean("TRue");
        System.out.println("Boolean with True: " + aBoolean);

        aBoolean = new Boolean("altceva");
        System.out.println("Boolean with altceva: " + aBoolean);

    }
}
