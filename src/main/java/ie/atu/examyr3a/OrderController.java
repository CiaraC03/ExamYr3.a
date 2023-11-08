package ie.atu.examyr3a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

public class OrderController {
    private final OrderService orderService;
    
    @Autowired
    public OrderController(OrderService orderService)
    {
        this.orderService = orderService;
    }
    @PostMapping("/confirm-order")
    public String comfirmOrder(@RequestBody TodoResponse todoResponse)
    {
        orderService.createOrder(todoResponse);
        return "Order" + todoResponse + "created";
    }
    @GetMapping("get-order")
    public List<TodoResponse>todoResponse()
    {
        return orderService.getOrderById();
    }

}
