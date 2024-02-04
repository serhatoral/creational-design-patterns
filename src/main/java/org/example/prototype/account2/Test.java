package org.example.prototype.account2;

/*

account2'de Prototype tasarım kalıbının Joshua Bloch'ın static factory metotdlarıyla birlikte kullanılması
örneği yer almaktadır. Bu durumda prototype nesneler aynı sınıf üzerinde static olarak tutulabilirler.
 */

public class Test {

    public static void main(String[] args) {


        Account normalAccount = Account.createNormalAccount("Aleyna", 4500);
        normalAccount.setIban("2");
        System.out.println(normalAccount.isOpenToWithdraw());
        System.out.println(normalAccount.isOpenToPayment());
        System.out.println(normalAccount.isOpenToTransfer());

        System.out.println();

        // Negative account
        Account negativeAccount = Account.createNegativeAccount("Tarık", -750);
        System.out.println(negativeAccount.isOpenToWithdraw());
        System.out.println(negativeAccount.isOpenToPayment());
        System.out.println(negativeAccount.isOpenToTransfer());

        System.out.println();
        // Frozen default account
        Account frozenAccount = Account.createFrozenAccount("Buse", -1000);
        System.out.println(frozenAccount.isOpenToWithdraw());
        System.out.println(frozenAccount.isOpenToPayment());
        System.out.println(frozenAccount.isOpenToTransfer());
    }
}
