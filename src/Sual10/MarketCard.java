package Sual10;

import java.util.ArrayList;
import java.util.List;

public class MarketCard {
    List<Item> items ;

    public MarketCard(){
        items = new ArrayList<>();
    }

    public void add(Item item){
        items.add(item);
    }

    public int getPrice(){
        int total = 0;
        for(Item item : items) {
            total += item.getGetPrice();
        }
        return total;
    }
    public void pay(PaymentType paymentType) {
        int amount = getPrice();
        paymentType.pay(amount);
    }
}
