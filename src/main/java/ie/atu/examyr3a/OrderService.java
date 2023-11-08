package ie.atu.examyr3a;

import java.util.concurrent.CompletableFuture;
import java.util.List;

@Service
public class OrderService {

    private List<Order>order = new ArrayList<>();
    public void createOrder(TodoResponse todoResponse)
    {
        order.add(todoResponse);
    }

    public List<TodoResponse> getOrderById()
    {
        return orderId;
    }




}
