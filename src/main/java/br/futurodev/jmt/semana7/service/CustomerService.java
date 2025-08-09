package br.futurodev.jmt.semana7.service;

import br.futurodev.jmt.semana7.dto.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    private final List<CustomerDto> customers = new ArrayList<>();

    public CustomerDto save(CustomerDto dto) {
        customers.add(dto);
        return dto;
    }

    public List<CustomerDto> findAll() {
        return customers;
    }

    public CustomerDto findById(Long id) {
        for (CustomerDto customer : customers) {
            if (customer.id().equals(id)) {
                return customer;
            }
        }
        return null;
    }
}
