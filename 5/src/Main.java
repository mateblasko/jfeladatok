import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        OrderItem item1 = new OrderItem(100, 1, "a", OrderType.TYPE_A);
        OrderItem item2 = new OrderItem(200, 2, "b", OrderType.TYPE_B);

        List<OrderItem> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);

        Order order = new Order(items,true);
        OrderProcessor op = new OrderProcessor();
        op.processOrder(order);
        System.out.println(order);

        OrderItem item3 = new OrderItem(100, 2, "b", OrderType.TYPE_B);

        order.getItems().add(item3);
        op.processOrder(order);
        System.out.println(order);
    }
}

