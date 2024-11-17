
import java.util.*;

public final class Order 
{
    private    List<OrderItem>   items      ;
    private int                 totalPrice  ;
    private boolean             discount    ;

    protected Order() {
        super();
    }
            
    public Order(List<OrderItem> items, boolean discount) {
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

    public void calculateTotalPrice() {
        int totalPrice = 0;
        for(OrderItem item : getItems()) {
            totalPrice += item.calculatePrice(getDiscount());
        }
        setTotalPrice(totalPrice);
    }

    public boolean getDiscount() {
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