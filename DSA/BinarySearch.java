import java.util.Scanner;
class BinarySearch { 
    int search(int arr[], int x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2;

            if (arr[m] == x)    //if x is in the middle
                return m; 
            if (arr[m] < x) //if x is greater, search the right half
                l = m + 1; 
            else         //if x is smaller, search the left half 
                r = m - 1; 
        } 
        return -1; //not found
    } 
    public static void main(String args[]) 
    { 
        BinarySearch s=new BinarySearch(); 
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the element to be searched ");
        int num=sc.nextInt();
        int arr[]={3,5,6,7,10,14,15,75,88,96,99}; 
        int result = s.search(arr, num); 
        if (result == -1) 
            System.out.println("No match found in the Array"); 
        else
            System.out.println("Match found at index " + result); 
    } 
} 
