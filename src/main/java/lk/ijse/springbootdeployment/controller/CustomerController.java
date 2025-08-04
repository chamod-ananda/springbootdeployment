package lk.ijse.springbootdeployment.controller;

import lk.ijse.springbootdeployment.entity.Customer;
import lk.ijse.springbootdeployment.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;
    public String getAllCustomers() {
        return "List of all customers";
    }

    @PostMapping("/save")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
        return ResponseEntity.ok(customerService.createCustomer(customer));
    }
}
