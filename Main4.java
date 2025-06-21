public class Main4 {
    public class BankAccount {
        protected String account;
        protected double balance;

        public BankAccount(String account, double balance) {
            this.account = account;
            this.balance = balance;
        }

        public String getAccount() {
            return account;
        }

        public double getBalance() {
            return balance;
        }

        public void setAccount(String account) {
            this.account = account;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
    }
    public class CheckingAccount extends BankAccount {
        private double limit;

        public CheckingAccount(String account, double balance, double limit) {
            super(account, balance);
            this.limit = limit;
        }

        public double getLimit() {
            return limit;
        }

        public void setLimit(double limit) {
            this.limit = limit;
        }
    }
    public class SavingsAccount extends BankAccount {

        public SavingsAccount(String account, double balance) {
            super(account, balance);
        }
    }
    public class COD extends BankAccount {

        public COD(String account, double balance) {
            super(account, balance);
        }
    }
    public class Main {
        public void main(String... args) {
            CheckingAccount checking = new CheckingAccount("CHK123", 1000.0, 500.0);
            SavingsAccount savings = new SavingsAccount("SAV456", 2500.0);
            COD cod = new COD("COD789", 5000.0);

            System.out.println("Checking Account: " + checking.getAccount() + ", Balance: " + checking.getBalance() + ", Limit: " + checking.getLimit());
            System.out.println("Savings Account: " + savings.getAccount() + ", Balance: " + savings.getBalance());
            System.out.println("COD Account: " + cod.getAccount() + ", Balance: " + cod.getBalance());
        }
    }

}
