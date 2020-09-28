class Reverse{
    public static void main(String[] args){
        String word = "hello";
        String reverse = "";
        int i = word.length() - 1;
        while(i >= 0){
            char ch = word.charAt(i);
            reverse += ch;
            i--;
        }
        System.out.println("Reverse = " + reverse);
    }
}