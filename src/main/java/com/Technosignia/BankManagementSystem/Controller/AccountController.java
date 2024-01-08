package com.Technosignia.BankManagementSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Technosignia.BankManagementSystem.Entity.Accounts;
import com.Technosignia.BankManagementSystem.Service.AccountService;
@RestController
public class AccountController {
     @Autowired
     AccountService accountService;
     @PostMapping("/account")
     public Accounts createAccount(@RequestBody Accounts accounts)
     {
    	 return accountService.createAccount(accounts);
     }
     @GetMapping("/findaccount/{accno}")
     public Accounts findAccountByNo(@PathVariable Long accno)
     {
    	 return accountService.getAccountsByNo(accno);
     }
     @GetMapping("/findallaccount")
     public List<Accounts> findAllAccounts()
     {
    	 return accountService.getAllAccounts();
     }
     @DeleteMapping("/deleteaccount/{accno}")
     public String deleteAccounts(@PathVariable Long accno)
     {
    	 accountService.deleteAccounts(accno);
    	 return "Account Deleted Successffully";
     }
     @PutMapping("/updateaccount/{accno}")
     public Accounts updateAccounts(@RequestBody Accounts accounts,@PathVariable Long accno)
     {
    	 return accountService.updateAccounts(accounts, accno);
     }
}
