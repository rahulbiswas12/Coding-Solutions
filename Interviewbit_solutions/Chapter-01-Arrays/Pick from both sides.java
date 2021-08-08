public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int sum = 0, start = A.size()-B;
        //get sum of last B numbers
        while(start != A.size()){
            sum += A.get(start);
            start++;
        }
        int max = sum;
        max = sum > max? sum: max;
        start = A.size() -B +1;
        //now slide element by element
        int end = 0;
        while(start <= A.size()){
            sum = sum - A.get(start-1) + A.get(end);
            max = sum > max? sum: max;
            start++;
            end++;
        }
        //get sum of first B numbers
        start = 0;
        sum = 0;
        while(start != B){
            sum += A.get(start);
            start++;
        }
        max = sum > max? sum: max;
        return max;

    }
}
