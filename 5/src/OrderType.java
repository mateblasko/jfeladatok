
public final class OrderType 
{
    public static final OrderType TYPE_A = new OrderType("_A_", 10);
    public static final OrderType TYPE_B = new OrderType("_B_", 20);
    
    private final String type       ;
    private final int    discount   ;
    
    private OrderType(String type, int discount) {
        this.type       = type      ;
        this.discount   = discount  ;
    }

    public String getType() {
        return type;
    }

    public int getDiscount() {
        return discount;
    }
}