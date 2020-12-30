public class SecondSmallest {
    public static void main(String[] args) {
        int ar[] = { 1, 5, 6, 2, 8, 3 };
        int smallest;
        int secondSmallest;
        if(ar[0] < ar[1]){
            smallest = ar[0];
            secondSmallest = ar[1];
        }
        else{
            smallest = ar[1];
            secondSmallest = ar[0];
        }
        for (int i = 1; i < ar.length; i++) {
            if(ar[i] < smallest){
                secondSmallest = smallest;
                smallest = ar[i];
            }
            else if(ar[i] < secondSmallest){
                secondSmallest = ar[i];
            }
        }
        System.out.println("Second smallest = " + secondSmallest);
        System.out.println("Smallest = " + smallest);
    }
}
