package br.futurodev.jmt.semana7.controller;

import br.futurodev.jmt.semana7.dto.CustomerDto;
import br.futurodev.jmt.semana7.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customers")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping
    public List<CustomerDto> get() {
        return service.findAll();
    }

    @GetMapping("{id}")
    public CustomerDto getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public CustomerDto post(@RequestBody CustomerDto dto) {
        return service.save(dto);
    }

}
