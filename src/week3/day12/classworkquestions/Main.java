package week3.day12.classworkquestions;

public class Main {
    public static void main(String[] args) {
       BankAccount account = new BankAccount("Soumya", 5000);

        System.out.println(account.getAccountNumber());
        System.out.println(account.getAmount());
        account.printDetails();

//         System.out.println(account.amount);

         System.out.println(account.bankName);
    }



}
