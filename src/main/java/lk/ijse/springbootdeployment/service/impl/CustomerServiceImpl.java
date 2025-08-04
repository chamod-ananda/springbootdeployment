package lk.ijse.springbootdeployment.service.impl;

import lk.ijse.springbootdeployment.entity.Customer;
import lk.ijse.springbootdeployment.repository.CustomerRepo;
import lk.ijse.springbootdeployment.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepo customerRepo;
    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepo.save(customer);
    }
}
