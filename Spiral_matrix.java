import java.util.*;

public class Spiral_matrix
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i = 0, j = 0, c = 1, n;
        System.out.print("Enter size of matrix: ");
        n = in.nextInt();
        int arr[][] = new int[n][n];
        int top = 0, bottom = n, left = 0, right = n;
        
        while(arr[i][j] == 0)
        {
            for(; j < right; j++)
            {
                arr[i][j] = c++;
            }
            j--;
            i++;
            for(; i < bottom; i++)
            {
                arr[i][j] = c++;
            }
            i--;
            j--;
            for(; j >= left; j--)
            {
                arr[i][j] = c++;
            }
            j++;
            i--;
            for(; i > top; i--)
            {
                arr[i][j] = c++;
            }
            i++;
            j++;
            
            top++;
            bottom--;
            left++;
            right--;
        }
        
        for(i = 0; i < n; i++)
        {
            for(j = 0; j < n; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
