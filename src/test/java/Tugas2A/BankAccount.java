package Tugas2A;

import java.util.Scanner;

public class BankAccount {
    String accountNumber;
    int ballance;
    String customerName;
    String customerEmail;
    String customerPhone;

    public BankAccount(){
        System.out.println("Default constructor");
        this.accountNumber = "12132141412";
        this.ballance = 1000;
        this.customerName = "Anggit";
        this.customerEmail = "anggit@gmail.com";
        this.customerPhone = "0913123132";
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBallance(int ballance){
        this.ballance = ballance;
    }

    public int getBallance() {
        return ballance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerEmail(String customerEmail){
        this.customerEmail = customerEmail;
    }

    public String getCustomerEmail(){
        return customerEmail;
    }

    public void setCustomerPhone(String customerPhone){
        this.customerPhone = customerPhone;
    }

    public String getCustomerPhone(){
        return customerPhone;
    }

    public void methodDeposit(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter deposit amount: $");
        int deposit = input.nextInt();
        int result = this.ballance + deposit;
        System.out.println("You have successfully made a deposit!");
        System.out.println("Current ballance: $" + result);

        this.ballance = result;
    }

    public void methodWithdraw(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter withdraw amounth: $");
        int withdraw = input.nextInt();
        int result = this.ballance - withdraw;

        if(withdraw > ballance){
            System.out.println("Saldo tidak mencukupi");
        } else {
            System.out.println("You have successfully made a withdraw!");
            System.out.println("Current ballance: $" + result);
        }
    }
}
