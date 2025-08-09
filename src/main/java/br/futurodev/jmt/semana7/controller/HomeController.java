package br.futurodev.jmt.semana7.controller;

import io.micrometer.common.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {

    @GetMapping
    public String get() {
        return "Hello World! 🌎";
    }

    /* Path parameters */
    @GetMapping("hello/{name}")
    public String hello(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    /* Query parameters */
    @GetMapping("parameters")
    public String parameters(String name, Integer age, Boolean active) {
        String response = "";

        if (StringUtils.isNotBlank(name)) {
            response += "Your name is " + name + ". ";
        }

        if (age != null) {
            response += "You are " + age + " years old. ";
        }

        if (active != null) {
            response += "You are " + (!active ? "NOT " : "") + "active now.";
        }

        if (StringUtils.isBlank(response)) {
            response = "Hello my friend!";
        }

        return response;
    }

}
