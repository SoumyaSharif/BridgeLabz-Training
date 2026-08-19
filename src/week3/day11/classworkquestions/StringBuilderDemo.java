package week3.day11.classworkquestions;

public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello ");
        sb.append(1);
        sb.append(2);
        sb.delete(1, 3);
        System.out.println(sb.toString());
    }
}
