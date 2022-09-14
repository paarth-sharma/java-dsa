import java.util.*; 
class Matrix_Multiplication { 

    static void printMatrix(int M[][],int rowSize,int colSize){
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++)
                System.out.print(M[i][j] + " ");

            System.out.println();
        }
    }
 
    static void multiplyMatrix(int row1, int col1, int A[][],int row2, int col2, int B[][]){
        int i, j, k;
 
        System.out.println("\nMatrix A:");
        printMatrix(A, row1, col1);
        System.out.println("\nMatrix B:");
        printMatrix(B, row2, col2);
 
        // Check if multiplication is Possible
        if (row2 != col1) {
            System.out.println("\nMultiplication Not Possible");
            return;
        }
 
        int C[][] = new int[row1][col2];
 
        // Multiply the two matrices
        for (i = 0; i < row1; i++) {
            for (j = 0; j < col2; j++) {
                for (k = 0; k < row2; k++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }
 
        System.out.println("\nResultant Matrix:");
        printMatrix(C, row1, col2);
    }
    public static void main(String[] args){
 
        Scanner key = new Scanner(System.in);

        System.out.println("Enter the rows and cols for the first matrix: ");
        int row1 = key.nextInt();
        int col1 = key.nextInt();
        int A[][] = new int [row1][col1];
        for(int i=0;i < row1 ;i++)
            for(int j =0; j< col1; j++)
                A[i][j] = key.nextInt();

        System.out.println("Enter the rows and cols for the second matrix: ");
        int row2 = key.nextInt();
        int col2 = key.nextInt();
        int B[][] = new int [row2][col2];
        for(int i=0;i < row2 ;i++)
            for(int j =0; j< col2; j++)
                B[i][j] = key.nextInt();
 
        multiplyMatrix(row1, col1, A, row2, col2, B);

        key.close();
    }
}