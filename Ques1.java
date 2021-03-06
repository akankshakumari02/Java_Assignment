package com.example.rest.webservices.RestfulServices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class SpringController1
{
    /** here we are returning back hard coded string*/
    @GetMapping("/welcome")
    public String welcome()
    {
        return "Welcome to Spring Boot";
    }

    /** here we are returning back the bean
     * converting it to json format automatically */
    @GetMapping("/welcome-bean")
    public WelcomeBean welcomeBean()
    {
        return new WelcomeBean("Welcome to Spring Boot");
    }

    /**  printing using the path variable*/
    @GetMapping("/welcome-bean/{name}")
    public WelcomeBean welcomeBean(@PathVariable String name)
    {
        return new WelcomeBean(String.format("Welcome to %s ", name));
    }
}


class WelcomeBean
{
    private final String message;

    public WelcomeBean(String message)
    {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "WelcomeBean{" +
                "message='" + message + '\'' +
                '}';
    }
}