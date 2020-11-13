package Sync;

class Table {
    //only one thread will enter at a time, hence no overlapping of results
    synchronized void printTable(int n){
        for(int i = 1; i <= 5; i++){
            System.out.println(i * n);
            //sleep for 500ms
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

public class Main{
    public static void main(String[] args) {
        Table t = new Table();
        //create two threads
        MyThread thread1 = new MyThread(t);
        MyThread2 thread2 = new MyThread2(t);
        thread1.start();
        thread2.start();
    }
}

//define custom thread 1
class MyThread extends Thread{
    Table table;

    MyThread(Table table){
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(3);
        super.run();
    }
}

//define custom thread 2
class MyThread2 extends Thread{
    Table table;

    MyThread2(Table table){
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(5);
        super.run();
    }
}
