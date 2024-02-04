package org.example.prototype.account1;

public interface Factory {

    Account createNormalAccount();

    Account createNormalAccount(String owner, double balance);

    Account createNegativeAccount(String owner, double balance);

    Account createFrozenAccount(String owner, double balance);
}
