package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "app")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        greetings();
    }


    public static void greetings(){
        System.out.println("HELLO DOCKER I'M HERE UPDATE");
    }

}
