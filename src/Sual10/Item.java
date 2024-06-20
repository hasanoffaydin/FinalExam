package Sual10;

public class Item {
    private String barcode;
    private int getPrice;

    public Item(int getPrice,String barcode) {
        this.getPrice = getPrice;
        this.barcode = barcode;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public int getGetPrice() {
        return getPrice;
    }

    public void setGetPrice(int getPrice) {
        this.getPrice = getPrice;
    }
}
