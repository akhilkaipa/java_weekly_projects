class NotEnoughMoneyException extends Exception {
    public NotEnoughMoneyException(String message) {
        super(message);
    }
}

class Account {
    private String owner;
    private int balance;
    private String accountNumber;

    public Account(String owner, int balance, String accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void transfer(int amount) throws NotEnoughMoneyException {
        if (amount > balance) {
            throw new NotEnoughMoneyException("Insufficient funds for this transfer.");
        }
        balance -= amount;
        System.out.println("Transfer successful. Amount: " + amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Account account = new Account("Akhil", 1000, "ACC123");

        try {
            account.transfer(1500);
        } catch (NotEnoughMoneyException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("Final Balance: " + account.getBalance());
        }
    }
}
