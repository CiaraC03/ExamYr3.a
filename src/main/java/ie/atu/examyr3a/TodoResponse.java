package ie.atu.examyr3a;

import com.fasterxml.jackson.annotation.JsonProperty;

@Data
public class TodoResponse {
    @JsonProperty("orderId")
    private int orderId;
    @JsonProperty("productId")
    private int productID;
    @JsonProperty("quantity")
    private int quantity;
    @JsonProperty("customerID")
    private int customerID;
}
