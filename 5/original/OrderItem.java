
public final class OrderItem 
{
    protected int       price   ;
    protected int       quantity;
    protected String    name    ;
    protected OrderType type    ;

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
}