package Tugas2A;

import java.util.Scanner;

public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        System.out.println("==========================================================");
        System.out.println("Account Information");
        System.out.println("==========================================================");

        account.setAccountNumber("123123241");
        System.out.println("Account Number : " + account.getAccountNumber());

        account.setCustomerName("Anggit Astriani");
        System.out.println("Customer Name : " + account.getCustomerName());

        account.setCustomerEmail("anggitastriani10@gmail.com");
        System.out.println("Customer Email : " + account.getCustomerEmail());

        account.setCustomerPhone("9013912123");
        System.out.println("Customer Phone : " + account.getCustomerPhone());

        System.out.println("==========================================================");

        account.setBallance(2100);
        System.out.println("Balance : $" + account.getBallance());

        account.methodDeposit();
        System.out.println("");
        account.methodWithdraw();
    }
}
