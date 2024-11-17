
public final class OrderItem 
{
    private int       price   ;
    private int       quantity;
    private String    name    ;
    private OrderType type    ;

    public OrderItem(int price, int quantity, String name, OrderType type) {
        this.price    = price   ;
        this.quantity = quantity;
        this.name     = name    ;
        this.type     = type    ;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public OrderType getType() {
        return type;
    }

    public int calculatePrice(boolean discount) { 
        if(discount) {
            return ((int)(getPrice() * ( (100 - (double)getType().getDiscount()) / 100)) * getQuantity());
        } 
        return (int)getPrice() * getQuantity();

    }
}