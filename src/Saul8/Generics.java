package Saul8;

public class Generics {
    public <U> U add(U value) {
        return value;
    }

    public static void main(String[] args) {
        Generics generics = new Generics();

        String strValue = generics.add("Hello");
        Integer intValue = generics.add(123);

        System.out.println("String value: " + strValue);
        System.out.println("Integer value: " + intValue);
    }
}
