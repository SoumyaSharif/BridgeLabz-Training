package week3.day14.classworkquestions.Encapsulation;

public class BankAccount {

    private int balance ;

    public int getBalance(){
        return balance ;
    }

    public int setbalance(int amt){

        if(amt>0){
            balance = amt ;
            return balance ;
        }else{
            System.out.println("Invalid");
        }

        return 0 ;
    }

    public static void main(String[] args){
        BankAccount b1 = new BankAccount();
        b1.balance = 100 ;

        System.out.println(b1.getBalance()) ;
        b1.setbalance(1200);

    }
}
