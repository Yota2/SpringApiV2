package testapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import testapp.data.Test;
import testapp.services.Servics;

import java.util.Arrays;
import java.util.List;


@RestController
public class HelloControler {
    @RequestMapping("/hello")
    public String returnHI() {
        return "Huhu";
    }

    @RequestMapping("/")
    public String returnHello() {
        return "Hello";
    }

    @RestController
    public class serviceController {
        @Autowired
        private Servics servics;

        @RequestMapping("/services")
        public List<Test> getAllServics(){
            return servics.getAllservics();
        }
    }
}