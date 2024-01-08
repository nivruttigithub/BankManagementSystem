package com.Technosignia.BankManagementSystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Technosignia.BankManagementSystem.DAO.AccountRepository;
import com.Technosignia.BankManagementSystem.Entity.Accounts;

@Service
public class AccountService {
        @Autowired
        AccountRepository accountRepository;
        public Accounts createAccount(Accounts accounts)
        {
        	return accountRepository.save(accounts);
        }
        public Accounts getAccountsByNo(Long accno)
        {
        	return accountRepository.findById(accno).get();
        }
        public List<Accounts> getAllAccounts()
        {
        	return accountRepository.findAll();
        }
        public void deleteAccounts(Long accno)
        {
        	accountRepository.deleteById(accno);
        }
        public Accounts updateAccounts(Accounts correctaccounts,Long accno)
        {
        	Accounts accounts=accountRepository.findById(accno).get();
        	if(accounts.getAccno()!=null)
        	{
        		accounts.setAccno(correctaccounts.getAccno());
        	}
        	if(accounts.getAccholdername()!=null)
        	{
        		accounts.setAccholdername(correctaccounts.getAccholdername());
        	}
        	if(accounts.getAcctype()!=null)
        	{
        		accounts.setAcctype(correctaccounts.getAcctype());
        	}
        	if(accounts.getBankname()!=null)
        	{
        		accounts.setBankname(correctaccounts.getBankname());
        	}
        	if(accounts.getAccbalance()!=null)
        	{
        		accounts.setAccbalance(correctaccounts.getAccbalance());
        	}
        	return accountRepository.save(accounts);
        }
}