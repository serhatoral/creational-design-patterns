package org.example.prototype.account1;

/*
 account1 paketi, account nesnesinin farklı durumlara sahip farklı nesnelerini üretmek için Prototype Tasarım kalıbının
 Abstract Factory kalıbıyla birlikte kullanma örneğidir.

 */


public class Test {

    public static void main(String[] args) {
        Factory factory = new AccountFactory();

        // Normal account. Credit amount is fixed at 1000.
        Account normalAccount = factory.createNormalAccount("Duygu", 4500);
        normalAccount.setIban("2");
        System.out.println(normalAccount.isOpenToWithdraw());
        System.out.println(normalAccount.isOpenToPayment());
        System.out.println(normalAccount.isOpenToTransfer());

        System.out.println();

        // Negative account
        Account negativeAccount = factory.createNegativeAccount("Serkan", -750);
        System.out.println(negativeAccount.isOpenToWithdraw());
        System.out.println(negativeAccount.isOpenToPayment());
        System.out.println(negativeAccount.isOpenToTransfer());

        System.out.println();
        // Frozen default account
        Account frozenAccount = factory.createFrozenAccount("Hakan", -1000);
        System.out.println(frozenAccount.isOpenToWithdraw());
        System.out.println(frozenAccount.isOpenToPayment());
        System.out.println(frozenAccount.isOpenToTransfer());
    }
}
