package com.example.dental_management_system.rest;
import com.example.dental_management_system.pojo.CustomerData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;
import com.stripe.model.CustomerCollection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class StripePaymentControllerApi {
    @Value("${stripe.apikey}")
    String srtipeapikey;

    @RequestMapping("/createCustomer")
    public CustomerData index(@RequestBody CustomerData data) throws StripeException {
        Stripe.apiKey= srtipeapikey;
        Map<String, Object> params = new HashMap<>();
        params.put("name", data.getName());
        params.put("email", data.getEmail());
        Customer customer = Customer.create(params);
        data.setCustomerId(customer.getId());
        return data;
    }
}

