package com.Technosignia.BankManagementSystem.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Technosignia.BankManagementSystem.Entity.Accounts;
@Repository
public interface AccountRepository extends JpaRepository<Accounts, Long> {

}
