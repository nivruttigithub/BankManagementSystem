package com.Technosignia.BankManagementSystem.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Technosignia.BankManagementSystem.Entity.Employee;

public interface employeeRepository extends JpaRepository<Employee, Long> {

}
