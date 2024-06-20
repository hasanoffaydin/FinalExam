package Sual2;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer newObserver = new Observer1("Aydin");
        subject.add(newObserver);
        subject.setMessage("Hello Everyone");
    }
}
