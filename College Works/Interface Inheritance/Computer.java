//create an interface for the printer to communicate with the computer
interface PrinterCallback{
    //onFinish() will be called once the printing is over
    void onFinish();
    //you can add onError() onBegin() etc..
}

//class for printer
class Printer{
//create an object reference for printer callback
PrinterCallback printerCallback;

    //constructor to initiliaze printer callback
    Printer(PrinterCallback printerCallback){
        this.printerCallback = printerCallback;
    }

    //function to print
    void print(String data){
        System.out.println("Printing... " + data);
        //after printing is done, call onFinish() from printer callback
        printerCallback.onFinish();
    }
}

//implement my own version of printer callback
class MyCallback implements PrinterCallback{
    //here I can choose what to do after printing is done
    public void onFinish() {
        System.out.println("Printing finished");
    };
}

class Computer{
    public static void main(String[] args) {
        //create an object of my callback
        PrinterCallback myCallback = new MyCallback();
        //create an object for printer and pass my callback
        Printer printer = new Printer(myCallback);
        //call print from printer object and pass data to be printed
        printer.print("Hello World");
    }
}