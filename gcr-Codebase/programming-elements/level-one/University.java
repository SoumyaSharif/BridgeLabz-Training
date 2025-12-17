public class University{
     public static void main(String[] args){
     
     //Create Integer variables name and assign them values 
     int amountOfFees = 125000;
     int discount = 10 ;
     int discountedAmount = (amountOfFees * discount)/100;
     int discountedPrice = amountOfFees - discountedAmount ;

     //Display the result
     System.out.print("The discount amount is INR " + discountedAmount + "and final discounted fee is INR" + discountedPrice);
     
     }
}