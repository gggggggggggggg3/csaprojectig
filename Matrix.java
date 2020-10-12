        import java.util.Scanner;
        
           public class Matrix
           {
            
               public static void main(String[] args) {
            
                 int row = 4;
                 int column = 5;
                 int[][] matrix = new int [row][column];
                
                    for (int i = 0; i < row; i++) 
                    {
                       for(int j = 0; j < row; j++) 
                       {
                           matrix[i][j] = 2;
                        }
                    }
                
                    for (int i = 0; i < row; i++) 
                    {
                        for(int j = 0; j < row; j++) 
                        {
                            System.out.print(matrix[i][j] + " ");
                        }
                        System.out.println();
                    }
                }    
            } 
