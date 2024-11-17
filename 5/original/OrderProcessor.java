
import java.io.*;

public class OrderProcessor 
{
    public OrderProcessor() {
        super();
    }
    
    public void processOrder(Order order) 
    {
        int            totalPrice;    
        BufferedWriter writer    ;
        
        // check order
        if (order == null) {
            return;
        }
        
        if (order.getItems() == null || order.getItems().isEmpty()) {
            return;
        }

        // calculate total price, apply discount 
        totalPrice = 0;
        for(OrderItem item : order.getItems()) {
            if (order.isDiscount()) {
                totalPrice = totalPrice + ((int)(item.getPrice() * ( (100 - (double)item.getType().getDiscount()) / 100)) * item.getQuantity());
            } else {
                totalPrice = totalPrice + (item.getPrice() * item.getQuantity());
            }
        }
        order.setTotalPrice(totalPrice);
        
        // write out
        writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("order-UTF8.csv")));
            writer.write(order.generateCsv());
            writer.flush();
            writer.close();
        } catch(Exception e) {
            System.err.println("error i/o: " + e.getMessage());
        }    
    }
}