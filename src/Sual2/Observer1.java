package Sual2;

public class Observer1 implements Observer{
    String name;

    public Observer1(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " Message elave olundu " + message);
    }
}
