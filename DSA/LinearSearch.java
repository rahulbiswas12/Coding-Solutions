import java.util.Scanner;
public class LinearSearch
{  
public static int search(int ar[], int s) 
{ 
    int l = ar.length; 
    for(int i = 0; i < l; i++) 
    { 
        if(ar[i] == s) 
            return i; 
    } 
    return -1; 
} 
public static void main(String args[]) 
{ 
    int ar[] = { 2, 3, 4, 10, 40 };
    System.out.println("Enter a number you want to search for - ");
    Scanner s= new Scanner(System.in);
    int num=s.nextInt();
    int result = search(ar, num)+1; 
    if(result == -1) 
        System.out.print("Element not found."); 
    else
        System.out.print("Element found at index " + result); 
} 
} 
