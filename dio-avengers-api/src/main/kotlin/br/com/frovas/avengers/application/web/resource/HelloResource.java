package br.com.frovas.avengers.application.web.resource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

    @GetMapping("hello")
    public String getAvengers() {
        return "Hello, Avengers!";
    }
}
