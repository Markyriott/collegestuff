import java.util.Random;

public class H3{
    public static void main(String[] args){
        // Question 4: 
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);
        System.out.printf("Rectangle width: %.2f, Rectangle height: %.2f, Rectangle area: %.2f, Rectangle perimeter: %.2f \n",
                rect1.width, rect1.height, rect1.getArea(), rect1.getPerimeter());
        System.out.printf("Rectangle width: %.2f, Rectangle height: %.2f, Rectangle area: %.2f, Rectangle perimeter: %.2f \n",
                rect2.width, rect2.height, rect2.getArea(), rect2.getPerimeter());

        // Question 5:
        Stock s = new Stock("ORCL", "Oracle Corporation", 34.5, 34.35);
        System.out.printf("Stock: %s, %s, Previous Closing Price: %.2f, Current Price: %.2f, Price Change Percentage: %.2f  \n",
                s.symbol, s.name, s.previousClosingPrice, s.currentPrice, s.getChangePercent());
        
        // Question 6:
        Random r = new Random(1000);
        System.out.print("Generating 50 random integers: ");
        for (int i = 0; i < 50; i++){
            System.out.print(r.nextInt(100) + ", ");
        }

        //Question 7:
        System.out.println("\nStarting Stopwatch");
        Stopwatch stopwatch = new Stopwatch();
        for(int i = 0; i < 10000; i++){}
        stopwatch.stop();
        System.out.println("Stopping Stopwatch");
        System.out.println("Elapsed Time: " + stopwatch.getElapsedTime());
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

class Stock{
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(String symbol, String name, double previous, double current){
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previous;
        this.currentPrice = current;
    }

    double getChangePercent(){
        double percent = ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
        return percent;
    }
}

class Stopwatch{
    private long startTime;
    private long endTime;

    Stopwatch(){
        this.startTime = System.currentTimeMillis();
    }

    long getStartTime(){
        return startTime;
    }

    long getEndTime(){
        return endTime;
    }

    void start(){
        this.startTime = System.currentTimeMillis();
    }

    void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return endTime - startTime;
    }
}
