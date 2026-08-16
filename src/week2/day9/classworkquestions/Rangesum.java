package week2.day9.classworkquestions;

public class Rangesum {

    public static void main(String[] args) {

        int arr[] = {2, 4, 6, 8, 10};

        //range is from index 2-5
        int start = 2;
        int end = 5;

        int sum =0;

        if (arr.length < end) {
            System.out.println("Range invalid");

        }
        else{

            for(int i=start ; i<=end; i++){
                sum = sum + arr[start];
            }

        }
        System.out.println(sum);

    }
}
