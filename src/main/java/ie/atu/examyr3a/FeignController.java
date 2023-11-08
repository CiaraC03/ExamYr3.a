package ie.atu.examyr3a;

public class FeignController {
    private final TodoClient todoClient;

    public FeignController(TodoClient todoClient)
    {
        this.todoClient=todoClient;
    }
    public TodoResponse fetchData()
    {
        TodoResponse td = todoClient.fetchData()
    }
}
