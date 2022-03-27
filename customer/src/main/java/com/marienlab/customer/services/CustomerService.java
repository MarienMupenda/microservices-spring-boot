package com.marienlab.customer.services;

import com.marienlab.customer.models.Customer;
import com.marienlab.customer.requests.StoreCustomerRequest;
import org.springframework.stereotype.Service;


public record CustomerService () {
    public Customer store(StoreCustomerRequest request) {
        return Customer.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .build();
    }
}
