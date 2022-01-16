class Solution
{ 
   public static int print2largest(int A[],int N) 
   {
       int max2 = 0 , max = 0;
       for(int i = 0 ; i< N; i++){
           if(A[i] > max){
               max2 = max ;
               max = A[i];
           } 
           else if (A[i] > max2 && A[i] != max) 
           max2 = A[i];
       } 
       if(max2 == 0)
       return -1 ;
       return max2 ;
   }
}
