public class Prime {
    public static void main(String[] args) {
        int num = 13;
        if(num == 1 || num == 0){
            System.out.println("Neither a prime nor composite.");
        }
        if(num < 0){
            System.out.println("Negative numbers cannot be prime.");
        }
        boolean prime = true;
        for(int i = 2; i < num / 2; i++){
            if(num % i == 0){
                prime = false;
                break;
            }
        }
        if(prime){
            System.out.println(num + " is a prime number.");
        }
        else{
            System.out.println(num + "  is not a prime number.");
        }
    }
}
