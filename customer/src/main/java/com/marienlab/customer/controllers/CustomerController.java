package com.marienlab.customer.controllers;

import com.marienlab.customer.models.Customer;
import com.marienlab.customer.requests.StoreCustomerRequest;
import com.marienlab.customer.services.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/customers")
public record CustomerController (CustomerService service){

    @RequestMapping("/")
    public String index() {
        log.info("CustomerController.index()");
        return "Greetings from Spring Boot!";
    }

    @PostMapping()
    public Customer store(@RequestBody StoreCustomerRequest request) {
        log.info("CustomerController.create()");

      return   service.store(request);
    }





}


