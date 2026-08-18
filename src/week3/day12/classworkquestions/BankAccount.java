package week3.day12.classworkquestions;

public class BankAccount {

    public String name ;
    public int account_number ;

    private int salary_amount ;


    public void AccountDetails(){
        System.out.println("AccountHolder's Name :" + name + " Salary Amount : " + salary_amount);
    }


    public static void main(String[] args){
        BankAccount acc1 = new BankAccount();


        acc1.AccountDetails();

    }
}
