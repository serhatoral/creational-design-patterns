package org.example.prototype.account1;

public class Account implements Cloneable{


    protected String iban;
    protected double balance;
    protected double credit;
    protected String owner; // just customer name for example

    private boolean openToWithdraw;
    private boolean openToPayment;
    private boolean openToTransfer;


    public Account(String iban, double balance, double credit, String owner, boolean openToWithdraw,
                   boolean openToPayment, boolean openToTransfer) {
        this.iban = iban;
        this.balance = balance;
        this.credit = credit;
        this.owner = owner;
        this.openToWithdraw = openToWithdraw;
        this.openToPayment = openToPayment;
        this.openToTransfer = openToTransfer;
    }


    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isOpenToWithdraw() {
        return openToWithdraw;
    }

    public void setOpenToWithdraw(boolean openToWithdraw) {
        this.openToWithdraw = openToWithdraw;
    }

    public boolean isOpenToPayment() {
        return openToPayment;
    }

    public void setOpenToPayment(boolean openToPayment) {
        this.openToPayment = openToPayment;
    }

    public boolean isOpenToTransfer() {
        return openToTransfer;
    }

    public void setOpenToTransfer(boolean openToTransfer) {
        this.openToTransfer = openToTransfer;
    }

    @Override
    public Account clone() {
        Account account = null;
        try {
            account = (Account) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Problem when cloning the object: " + e.getMessage());
            e.printStackTrace();
        }
        return account;
    }
}
