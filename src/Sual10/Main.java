package Sual10;

public class Main {
    public static void main(String[] args) {
        MarketCard card = new MarketCard();
        Item item1 = new Item(56,"123456");
        Item item2 = new Item(77,"555555");

        card.add(item1);
        card.add(item2);

        card.pay(new CardlaOde("123456789","Aydin","Hesenov"));
    }
}
