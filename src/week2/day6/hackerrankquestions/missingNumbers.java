package week2.day6.hackerrankquestions;

public class missingNumbers {

    public static void main(String[] args){
        int arr[] = {1,2,4};
        int brr[] = {1,2,4,6,7};

        for(int i=0 ; i<brr.length ; i++) {

            int result = BinarySearch(arr, brr[i]);
            if(result == -1) {
                System.out.print(brr[i] + " ");
            }
        }

    }

    public static int BinarySearch(int[] arr , int target){

       int low =0 ; // val=1 , 1
       int high = arr.length-1; //val=7 , 2

       while(low<=high){
           int mid = low + (high-low)/2 ; //val=4

           if(arr[mid] == target){
               return mid ;
           }
           else if(arr[mid] < target){
               low = mid +1 ;

           }
           else{
               high = mid -1 ;
           }
       }
        return -1 ;
    }
}
