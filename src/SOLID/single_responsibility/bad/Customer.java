package SOLID.single_responsibility.bad;

import java.math.BigDecimal;

/**
 * Created by agup101 on 4/25/2017.
 */
class Customer {

    private static final BigDecimal MINIMUM_REQUIRED_BALANCE = new BigDecimal(10);

    private String name;
    private BigDecimal balance;

    public Customer(String name, BigDecimal balance) {
        this.name = name;
        this.balance = balance;
    }

    public BigDecimal getAvailableFunds() {
        return subtractFromBalance(MINIMUM_REQUIRED_BALANCE);
    }

    public void deductFromBalanceBy(BigDecimal amountToDeduct) {
        if (amountToDeduct.compareTo(balance) > 0) {
            throw new UnsupportedOperationException("Insufficient funds.");
        }
        balance = subtractFromBalance(amountToDeduct);
    }

    private BigDecimal subtractFromBalance(BigDecimal amount) {
        return balance.subtract(amount);
    }


}