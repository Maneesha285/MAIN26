package org.neoteric.atm;

import org.neoteric.atm.User;

import java.util.Date;
import java.util.UUID;

public class AccountService {
    public  Account createAccount(User user){
        Account a=new Account();
        a.accountNumber= UUID.randomUUID().toString();
        a.user=user;
        return a;

    }

    public DebitCard issueDebitCard(Account account){

  DebitCard debitCard=new DebitCard();
  debitCard.atmNumber="3456";
  debitCard.cvv="v53";
  debitCard.fromDate=new Date();
  debitCard.toDate=new Date();
  debitCard.name= account.user.name;

return debitCard;

    }
}
