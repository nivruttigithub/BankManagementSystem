package com.Technosignia.BankManagementSystem.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Technosignia.BankManagementSystem.Entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
