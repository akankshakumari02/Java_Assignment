package com.example.springdata.hibernateinheritance.HibernateInheritance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(path = "/api")
public class PaymentController
{
    @Autowired
    private PaymentService paymentService;

    @GetMapping(path = "/payment")
    public Iterable<Payment> get() {
        return paymentService.retrieveCheck();
    }

    @PostMapping(path = "/checkpayment")
    public ResponseEntity<Object> addCheck(@RequestBody Check check) {
        Check user = paymentService.saveCheck(check);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PostMapping(path = "/cardpayment")
    public ResponseEntity<Object> addCard(@RequestBody CreditCard creditCard) {
        CreditCard user = paymentService.saveCreditCard(creditCard);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
}
