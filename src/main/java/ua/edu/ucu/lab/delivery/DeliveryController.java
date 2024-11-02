package ua.edu.ucu.lab.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/delivery")
public class DeliveryController {

    @GetMapping
    public String getDeliveries() {
        return "Right now our shop can deliver products "
                + "to you vai post or via DHL";
    }
}
