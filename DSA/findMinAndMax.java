// Q2) Maximum and minimum of an array using minimum number of comparisons

class Main
{
    public static void findMinAndMax(int[] A)
    {
        int max = A[0];
        int min = A[0];
        for (int i = 1; i < A.length; i++)
        {
            if (A[i] > max) {
                max = A[i];
            }
            else if (A[i] < min) {
                min = A[i];
            }
        }
 
        System.out.println("The minimum array element is " + min);
        System.out.println("The maximum array element is " + max);
    }
 
    public static void main(String[] args)
    {
        int[] A = { 5, 7, 2, 4, 9, 6 };
        findMinAndMax(A);
    }
}
