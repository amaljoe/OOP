public class Transpose {
    public static void main(String[] args){
        int mat[][] = {{1, 3, 4}, {2, 5, 6}, {3, 5, 7}};
        System.out.println("Matrix before transpose:");
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int transpose[][] = new int[mat.length][mat[0].length];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                transpose[i][j] = mat[j][i];
            }
        }
        System.out.println("\nMatrix after transpose:");
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
