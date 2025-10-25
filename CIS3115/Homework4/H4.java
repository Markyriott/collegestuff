class H4{
    public static void main(String[] args){
        // Question 1:
        MyInteger testInt = new MyInteger(6);
        MyInteger testInt2 = new MyInteger(7);
        System.out.println("testInt Value = " + testInt.getValue());
        System.out.println("Is testInt even? " + testInt.isEven());
        System.out.println("Is testInt odd? " + testInt.isOdd());
        System.out.println("Is testInt prime? " + testInt.isPrime());
        System.out.println("Is 5 even? " + MyInteger.isEven(5));
        System.out.println("Is 5 odd? " + MyInteger.isOdd(5));
        System.out.println("Is 5 prime? " + MyInteger.isPrime(5));
        System.out.println("testInt2 Value = " + testInt2.getValue());
        System.out.println("Is testInt2 even? " + MyInteger.isEven(testInt2));
        System.out.println("Is testInt2 odd? " + MyInteger.isOdd(testInt2));
        System.out.println("Is testInt2 prime? " + MyInteger.isPrime(testInt2));
        System.out.println("Is testInt equal to 5? " + testInt.equals(5));
        System.out.println("Is testInt equal to testInt2? " + testInt.equals(testInt2));
        char[] charArr = {'5','6','7'};
        System.out.println("5 + 6 + 7 = " + MyInteger.parseInt(charArr));
        System.out.println("5 + 6 + 7 = " + MyInteger.parseInt("567"));
    }
}

class MyInteger{
    int value;

    MyInteger(int v){
        this.value = v;
    }

    int getValue(){
        return this.value;
    }

    boolean isEven(){
        return value % 2 == 0;
    }

    boolean isOdd(){
        return value % 2 == 1;
    }

    boolean isPrime(){
        if (this.value <= 1){
            return false;
        }

        for (int i = 2; i * i <= this.value; i++){
            if (this.value % i == 0){
                return false;
            }
        }

        return true;
    }

    static boolean isEven(int num){
        return num % 2 == 0;
    }

    static boolean isOdd(int num){
        return num % 2 == 1;
    }

    static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }

        for (int i = 2; i * i <= num; i++){
            if (num % i == 0){
                return false;
            }
        }

        return true;
    }

    static boolean isEven(MyInteger num){
        return num.getValue() % 2 == 0;
    }

    static boolean isOdd(MyInteger num){
        return num.getValue() % 2 == 1;
    }

    static boolean isPrime(MyInteger num){
        if (num.getValue() <= 1){
            return false;
        }

        for (int i = 2; i * i <= num.getValue(); i++){
            if (num.getValue() % i == 0){
                return false;
            }
        }

        return true;
    }
    boolean equals(int num){
        return this.value == num;
    }
    
    boolean equals(MyInteger num){
        return this.value == num.getValue();
    }

    static int parseInt(char[] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum += arr[i] - '0';
        }

        return sum;
    }

    static int parseInt(String s){
        int sum = parseInt(s.toCharArray());
        return sum;
    }
}
