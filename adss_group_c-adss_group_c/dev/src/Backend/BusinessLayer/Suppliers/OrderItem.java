package Backend.BusinessLayer.Suppliers;

public class OrderItem {
    private int orderID;
    private int itemID;
    private int amount;
    private double itemPriceAfterDiscount;
    private String name;

    public OrderItem(int orderID, int itemID, int amount, double itemPriceAfterDiscount,String name) {
        this.orderID = orderID;
        this.itemID = itemID;
        this.amount = amount;
        this.itemPriceAfterDiscount = itemPriceAfterDiscount;
        this.name = name;
    }

    public int getOrderID() {
        return orderID;
    }

    public int getItemID() {
        return itemID;
    }

    public int getAmount() {
        return amount;
    }

    public double getItemPriceAfterDiscount() {
        return itemPriceAfterDiscount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setItemPriceAfterDiscount(double itemPriceAfterDiscount) {
        this.itemPriceAfterDiscount = itemPriceAfterDiscount;
    }

    public String getName() {
        return name;
    }
}
