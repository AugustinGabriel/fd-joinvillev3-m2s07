package br.futurodev.jmt.semana7.controller;

import br.futurodev.jmt.semana7.dto.CityRequestDto;
import br.futurodev.jmt.semana7.dto.CityResponseDto;
import br.futurodev.jmt.semana7.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cities")
public class CityController {

    @Autowired
    private CityService service;

    @GetMapping
    public List<CityResponseDto> get() {
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CityResponseDto post(@RequestBody CityRequestDto dto) {
        return service.save(dto);
    }

}
