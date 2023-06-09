package com.crudlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Main {

    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
    }
/*
    @GetMapping("/greet")
    public GreetResponse greet() {
        return new GreetResponse("Hello How are you ?");
    }
    record GreetResponse(String greet) { }
    class GreetResponse {
        private final String greet;

        GreetResponse(String greet){
            this.greet = greet;
        }

        public String getGreet() {
            return greet;
        }

        @Override
        public String toString() {
            return "GreetResponse{" +
                    "greet=" + greet +
                    '}';
        }
    }
*/

}
