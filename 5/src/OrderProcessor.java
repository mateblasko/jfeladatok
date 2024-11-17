
import java.io.*;

public class OrderProcessor 
{
    public OrderProcessor() {
        super();
    }
    
    public void processOrder(Order order)
    {    
        if (order == null) {
            return;
        }
        
        if (order.getItems() == null || order.getItems().isEmpty()) {
            return;
        }

        order.calculateTotalPrice();  
        writeOrderToFile(order);
    }

    public void writeOrderToFile(Order order) {
        BufferedWriter writer = null;
        try { 
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("order-UTF8.csv")));
            writer.write(order.generateCsv()); 
            writer.flush();
        } catch(Exception e) {
            System.err.println("error i/o: " + e.getMessage());
        } finally {
            if(writer!=null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.err.println("Failed to close writer: " + e.getMessage());
                }
            }
        }
    }
}