package OOP2_Coding_Challenges.CodingChallenge7_SOLID.SingleResponsibilityPrinciple.Adheres;

public class main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer customer = new Customer();
        Payment payment = new Payment();
        bank.makeDeposit();
        bank.makeWithdrawal();
        bank.makeTransfer();
        bank.makePayment();
        customer.makePayment();
        payment.makePayment();
    }
}
