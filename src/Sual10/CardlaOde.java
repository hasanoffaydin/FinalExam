package Sual10;

public class CardlaOde implements PaymentType{

    private String cardNumber;
    private String name;
    private String lastName;

    public CardlaOde(String cardNumber, String name, String lastName) {
        this.cardNumber = cardNumber;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Odenis Card Vasitesi ile heyata kecdi :) ");
    }
}
