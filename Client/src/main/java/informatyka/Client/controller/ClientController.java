package informatyka.Client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.nio.DoubleBuffer;

@RestController
public class ClientController {

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @ResponseBody
    @GetMapping("/")
    String show(){
        /*
        String d = restTemplate.getForEntity("http://localhost:8083/e", String.class).toString() ;
        Double e = Double.parseDouble(d);

        String d2 = restTemplate.getForEntity("http://localhost:8082/pi", String .class).toString();
        Double pi = Double.parseDouble(d2);

        Double wynik = e + pi;
        String pokaz = wynik.toString();
        */
        //return pokaz;

        return restTemplate.getForEntity("http://localhost:8082/pi", String .class).getBody() +
          restTemplate.getForEntity("http://localhost:8083/e", String.class).getBody() ;

    }
}
