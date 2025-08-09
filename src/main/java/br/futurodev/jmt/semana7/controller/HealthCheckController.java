package br.futurodev.jmt.semana7.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("health-check")
public class HealthCheckController {

    @GetMapping
    public String get() {
        return "🏃‍♂️💨 Server is running";
    }

}
