public class TestGarbage {
    //deprecated method - usually called before garbage collection
    public void finalize() {
        System.out.println("object is garbage collected");
    }

    public static void main(String args[]) {
        //creating objects for this class
        TestGarbage s1 = new TestGarbage();
        TestGarbage s2 = new TestGarbage();
        //pointing s1 and s2 to null so that it can be garbage collected
        s1 = null;
        s2 = null;
        //garbage collection
        System.gc();
    }
}