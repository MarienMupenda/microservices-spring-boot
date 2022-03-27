package com.marienlab.customer.requests;

public record StoreCustomerRequest(String firstName, String lastName, String email) {
    public String getFirstName() {
        return firstName;
    }
    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }
}
