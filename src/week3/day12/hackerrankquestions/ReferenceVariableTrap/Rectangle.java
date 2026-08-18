package week3.day12.hackerrankquestions.ReferenceVariableTrap;

import org.w3c.dom.css.Rect;

public class Rectangle {

    public int length ;
    public int width ;

    public Rectangle(int length , int width){
        this.length = length ;
        this.width = width ;
    }

    // copy constructor
    public Rectangle(Rectangle rect){
        this.length = rect.length;
        this.width = rect.width;
    }


    public void Scale(int factor){
        length = length*factor ;
        width = width*factor ;
    }

    public static void main(String[] args){
        Rectangle rect1 = new Rectangle(4, 5);
        Rectangle rect2 = new Rectangle(rect1) ;

        rect2.Scale(2);

        System.out.println("Length and Width of rect1 is 4 and 5");
        System.out.println("checking the length :" + rect1.length + "checking width:" + rect1.width);


    }

}
