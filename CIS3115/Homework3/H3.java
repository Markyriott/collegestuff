public class H3{
    public static void main(String[] args){
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);
        System.out.printf("Rectangle width: %.2f, Rectangle height: %.2f, Rectangle area: %.2f, Rectangle perimeter: %.2f \n",
                rect1.width, rect1.height, rect1.getArea(), rect1.getPerimeter());
        System.out.printf("Rectangle width: %.2f, Rectangle height: %.2f, Rectangle area: %.2f, Rectangle perimeter: %.2f \n",
                rect2.width, rect2.height, rect2.getArea(), rect2.getPerimeter());



    }
}

class Rectangle{
    double width = 1;
    double height = 1;

    Rectangle(){}

    Rectangle(double w, double h){
        width = w;
        height = h;
    }
    double getArea(){
        return width * height;
    }

    double getPerimeter(){
        return width * width + height * height;
    }
}


