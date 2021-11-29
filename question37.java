public class question37 {
    //spiral traversal in a matrix

    static void printSpiral(int matrix[][],int Row ,int Column) {
        //we initialize
        int top = 0, left = 0, bottom = Row - 1, right = Column - 1;

        //run while loop
        while (top <= bottom && left <= right) {

            //to print the top row
            for (int i = left; i <= right; i++)
                System.out.print(matrix[top][i] + " ");
            top++;
            //to print right column from top to bottom(top is 2 so printing will start from second column)
            for (int i = top; i <= bottom; i++)
                System.out.print(matrix[i][right] + " ");
            right--;
            // to print last column from right to left(right is reduced now so printing will start from second last element)
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(matrix[bottom][i] + " ");
                bottom--;
            }
            // to print first row from bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(matrix[i][left] + " ");
                left++;
            }
        }
    }

    public static void main(String args[])
    {
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};

        printSpiral(matrix, 4, 4);
    }
}



//TC-O(Row * Column)
//SC-O(1)



/*
//Arraylist Based sol


class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)

    {

         int top = 0, left = 0, bottom = r - 1, right = c - 1;
         ArrayList<Integer> fill=new ArrayList<Integer>();

        //run while loop
        while (top <= bottom && left <= right) {

            //to print the top row
            for (int i = left; i <= right; i++)
                fill.add(matrix[top][i]);
            top++;
            //to print right column from top to bottom(top is 2 so printing will start from second column)
            for (int i = top; i <= bottom; i++)
                fill.add(matrix[i][right]);
            right--;
            // to print last column from right to left(right is reduced now so printing will start from second last element)
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    fill.add(matrix[bottom][i]);
                bottom--;
            }
            // to print first row from bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    fill.add(matrix[i][left]);
                left++;
            }
        }
        return fill;
        // code here
    }
}
 */
