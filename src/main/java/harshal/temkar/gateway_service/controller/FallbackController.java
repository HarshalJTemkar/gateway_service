package harshal.temkar.gateway_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

	@GetMapping("/customerServiceFallBack")
    public String customerServiceFallBack() {
        return "Customer Service is down!";
    }
	
	@GetMapping("/paymentServiceFallBack")
    public String paymentServiceFallBack() {
        return "Payment Service is down!";
    }

}
