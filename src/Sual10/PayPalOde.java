package Sual10;

public class PayPalOde implements PaymentType{
    private String gmail;
    private String password;

    public PayPalOde(String gmail, String password) {
        this.gmail = gmail;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Odenis PayPal ile heyata kecdi :)");
    }
}
