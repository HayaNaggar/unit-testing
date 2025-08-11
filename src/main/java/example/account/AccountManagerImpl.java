package example.account;

public class AccountManagerImpl implements AccountManager {
    private static final int MAX_CREDIT = 1000;
    @Override
    public void deposit(Customer customer, int amount) {
        customer.setBalance(customer.getBalance() + amount);
    }

    @Override
    public String withdraw(Customer customer, int amount) {
        int expectedBalance = customer.getBalance() - amount;

        if (isOverdrawn(expectedBalance)) {
            if (!customer.isCreditAllowed()) {
                return "insufficient account balance";
            } else if (isOverCreditLimit(customer, expectedBalance)) {
                return "maximum credit exceeded";
            }
        }
        updateBalance(customer, expectedBalance);
        return "success";
    }
    private boolean isOverCreditLimit(Customer customer, int expectedBalance) {
     return !customer.isVip() && expectedBalance < MAX_CREDIT;
   
}
private void updateBalance(Customer customer, int newBalance) {
    customer.setBalance(newBalance);
}
private boolean isOverdrawn(int expectedBalance) {
    return expectedBalance < 0;
}
}
