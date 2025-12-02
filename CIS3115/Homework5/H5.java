class H5{
    public static void main(String[] args){

    }
}

import java.util.ArrayList;
import java.util.Date;

public class Question6 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        Loan loan = new Loan(5.5, 5, 10000); 
        list.add(loan);
        
        Date date = new Date();
        list.add(date);
        
        list.add("String");
        
        Circle circle = new Circle(5.0);
        list.add(circle);
        
        System.out.println("Elements in the ArrayList:");
        for (Object obj : list) {
            System.out.println(obj.toString());
        }
    }
}
