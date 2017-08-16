package Amulya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Test_Docker {
    @RequestMapping(value="/welcome")
    public String Hell0()
    {
        return "Welcome to docker application";
    }
    public static void main(String[] args)
    {
        SpringApplication.run(Test_Docker.class, args);
    }

}
