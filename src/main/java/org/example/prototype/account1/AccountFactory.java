package org.example.prototype.account1;

public class AccountFactory implements Factory{


    // Normal account prototype
    private static Account prototype = new Account("1", 0, 1000, null, true, true, true);

    // negative account prototype
    private static Account negativePrototype = new Account("1", 0, 1000, null, true, true, false);

    // frozen account prototype
    private static Account frozenPrototype = new Account("1", -1000, 1000, null, false, false, false);


    @Override
    public Account createNormalAccount() {
        return prototype.clone();
    }

    @Override
    public Account createNormalAccount(String owner, double balance) {
        Account account = prototype.clone();
        account.setOwner(owner);
        account.setBalance(balance);
        return account;
    }

    @Override
    public Account createNegativeAccount(String owner, double balance) {
        Account account = negativePrototype.clone();
        account.setOwner(owner);
        account.setBalance(balance);
        return account;
    }

    @Override
    public Account createFrozenAccount(String owner, double balance) {
        Account account = frozenPrototype.clone();
        account.setOwner(owner);
        account.setBalance(balance);
        return account;
    }
}
