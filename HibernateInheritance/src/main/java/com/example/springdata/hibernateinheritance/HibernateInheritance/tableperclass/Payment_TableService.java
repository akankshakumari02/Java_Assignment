package com.example.springdata.hibernateinheritance.HibernateInheritance.tableperclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Payment_TableService
{
    @Autowired
    private PaymentRepository2 paymentRepository;

    public Check2 saveCheck(Check2 check) {
        return paymentRepository.save(check);
    }

    public Iterable<Payment2> retrieveCheck() {
        return paymentRepository.findAll();
    }

    public CreditCard2 saveCreditCard(CreditCard2 creditCard) {
        return paymentRepository.save(creditCard);
    }

}
