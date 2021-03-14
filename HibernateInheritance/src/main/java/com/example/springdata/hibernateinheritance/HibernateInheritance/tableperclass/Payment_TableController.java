package com.example.springdata.hibernateinheritance.HibernateInheritance.tableperclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(path = "/api")
public class Payment_TableController
{
    @Autowired
    private Payment_TableService paymentService;

    @GetMapping(path = "/tablepayment")
    public Iterable<Payment2> get() {
        return paymentService.retrieveCheck();
    }

    @PostMapping(path = "/tablecheckpayment")
    public ResponseEntity<Object> addCheck(@RequestBody Check2 check) {
        Check2 user = paymentService.saveCheck(check);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PostMapping(path = "/tablecardpayment")
    public ResponseEntity<Object> addCard(@RequestBody CreditCard2 creditCard) {
        CreditCard2 user = paymentService.saveCreditCard(creditCard);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
}
