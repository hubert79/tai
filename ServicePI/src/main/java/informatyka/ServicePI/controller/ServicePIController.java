package informatyka.ServicePI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServicePIController {


    @GetMapping("pi")
    Double showPi(){

        Double d = Math.PI;
        return d;
    }
}
