import java.util.Arrays;
import java.util.List;
 
class Solution
{   
    static String remVowel(String str)
    {
         return str.replaceAll("[aeiouAEIOU]", "");
    }
    public static void main(String[] args)
    {
        String str = "My name is Rahul Biswas";       
        System.out.println(remVowel(str));
    }
}
