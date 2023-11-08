package ie.atu.examyr3a;

import java.util.List;

@Service
public class OrderService {

    private List<Order>order = new ArrayList<>();
    public void createOrder(TodoResponse todoResponse)
    {
        order.add(todoResponse);
        System.out.println("Order number" + todoResponse.getOrderId());
        System.out.println("Product number" + todoResponse.getProductID());
        System.out.println("Quantity number" + todoResponse.getQuantity());
        System.out.println("CustomerId number" + todoResponse.getCustomerID());
    }

    public List<TodoResponse> getOrderById()
    {
        return order;
    }




}
