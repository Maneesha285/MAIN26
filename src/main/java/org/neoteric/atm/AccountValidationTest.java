package org.neoteric.atm;


import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class AccountValidationTest {
    public static void main(String[] args) {
        AccountService as =new AccountService();

       User user=new User();
       user.name="maneesha";
       user.adharNumber="123456";
       user.mobileNumber="987654";
       user.pan="234567";

        Locale indiaLocale = new Locale("en", "IN");
        Locale.setDefault(indiaLocale);
        System.out.println("Default Locale: " + Locale.getDefault());


        Account maneeshaAccount=as.createAccount(user);
        System.out.println("Maneesha Account number:"+maneeshaAccount.accountNumber);


        DebitCard maneeshaDebitCard=as.issueDebitCard(maneeshaAccount);
        System.out.println("DebitCard Number:"+maneeshaDebitCard.atmNumber);
        System.out.println("Name:"+maneeshaDebitCard.name);

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println("UTC Time is: " + dateFormat.format(date));

    }
}
