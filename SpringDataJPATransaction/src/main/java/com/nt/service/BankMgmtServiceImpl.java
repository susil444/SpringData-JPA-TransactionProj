package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.BankAccount;
import com.nt.repository.IBankAccountRepository;
@Service
public class BankMgmtServiceImpl implements IBankMgmtService{
	@Autowired
	private IBankAccountRepository accountRepo;
	
	@Override
	public String openAccount(BankAccount account) {
		account.setCreateBy(System.getProperty("user.name"));
		long acno=accountRepo.save(account).getAccno();
	
		return "Bank Account is opened having account number::"+acno;
		
		
	}

	@Override
	public String withdraw(long acno, double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BankAccount showAccountDetails(long acno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deposite(long acno, double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String transferMoney(long srcAcno, long destAcno, double amount) {
		// TODO Auto-generated method stub
		return null;
	}

}
