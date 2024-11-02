package ua.edu.ucu.lab.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1payment")
public class PaymentController {

    @GetMapping
    public String getPayments() {
        return "Right now we support payment using credit card or via PayPal";
    }
}
