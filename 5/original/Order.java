
import java.util.*;

public final class Order 
{
    public    List<OrderItem>   items       ;
    protected int               totalPrice  ;
    protected boolean           discount    ;
    
    protected Order() {
        super();
    }
            
    public Order(List<OrderItem> items, boolean discount) {
        this();
        this.items      = items    ;
        this.discount   = discount ;
    }
    
    public List<OrderItem> getItems() {
        return items;
    }

    public int getTotalPrice() {
        return totalPrice;
    }
    
    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isDiscount() {
        return discount;
    }
    
    public String generateCsv() {
        return "its-not-important-atm";
    }

    @Override
    public String toString() {
        return "Order{" + "items.length=" + items.size() + ", totalPrice=" + totalPrice + ", discount=" + discount + '}';
    }
}