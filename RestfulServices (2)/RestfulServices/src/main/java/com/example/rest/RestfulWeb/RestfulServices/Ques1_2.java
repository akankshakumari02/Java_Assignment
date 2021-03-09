package com.example.rest.RestfulWeb.RestfulServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class Ques1_2
{
    @Autowired
    private MessageSource messageSource;

    @GetMapping("/hello")
    public String helloBean(@RequestHeader(value = "Accept-Language", required = false) Locale locale,@RequestParam("userName") String userName) {
        String arg[] = new String[]{userName};
        return messageSource.getMessage("hello.username", arg, locale);
    }
}
