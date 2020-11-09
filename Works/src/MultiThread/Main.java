package MultiThread;

// 11) Write a Java program that implements a multi-threaded program which has three threads.

//     First thread generates a random integer every 1 second. If the value is even, second
//     thread computes the square of the number and prints. If the value is odd the third thread
//     will print the value of cube of the number.

//run this thread for generating random numbers
class RandomThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int n = (int) Math.floor(Math.random() * 100);
            if(n % 2 == 0){
                //if number is even
                EvenThread even = new EvenThread(n);
                even.start();
            }else{
                //if number is odd
                OddThread odd = new OddThread(n);
                odd.start();
            }
            //wait for 1 second
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        super.run();
    }
}

//run this thread for even number
class EvenThread extends Thread {
int n;

    EvenThread(int n){
        this.n = n;
    }

    @Override
    public void run() {
        int square = (int) Math.pow(n, 2);
        System.out.println("Square of " + n + " is " + square);
        super.run();
    }
}

//run this thread for odd number
class OddThread extends Thread {
    int n;
    
        OddThread(int n){
            this.n = n;
        }
    
        @Override
        public void run() {
            int cube = (int) Math.pow(n, 3);
            System.out.println("Cube of " + n + " is " + cube);
            super.run();
        }
    }

public class Main {
    public static void main(String[] args) {
        //create a thread to generate random numbers
        RandomThread random = new RandomThread();
        random.start();
    }
}
