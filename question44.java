public class question44 {
    class GFG
    {
        static int n = 4;

        static void swap(int mat[][], int i, int j)
        {
            int temp = mat[i][j];
            mat[i][j] = mat[j][i];
            mat[j][i] = temp;
        }

        static void swap2(int low, int high, int i, int mat[][])
        {
            int temp = mat[low][i];
            mat[low][i] = mat[high][i];
            mat[high][i] = temp;
        }

        static void rotate90(int mat[][])
        {

            for(int i = 0; i < n; i++)
                for(int j = i + 1; j < n; j++)
                    swap(mat, i, j);

            for(int i = 0; i < n; i++)
            {
                int low = 0, high = n - 1;

                while(low < high)
                {
                    swap2(low, high, i, mat);

                    low++;
                    high--;
                }
            }
        }
}
