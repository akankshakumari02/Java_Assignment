package com.example.springdata.hibernateinheritance.HibernateInheritance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService
{
    @Autowired
    private PaymentRepository paymentRepository;
    public Check saveCheck(Check check) {
        return paymentRepository.save(check);
    }

    public Iterable<Payment> retrieveCheck() {
        return paymentRepository.findAll();
    }


    public CreditCard saveCreditCard(CreditCard creditCard) {
        return paymentRepository.save(creditCard);
    }

}
