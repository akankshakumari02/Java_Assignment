package com.example.springdata.hibernateinheritance.HibernateInheritance.tableperclass;

import com.example.springdata.hibernateinheritance.HibernateInheritance.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository2 extends CrudRepository<Payment2,Integer> {
}
