public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        BigInteger n = new BigInteger(scanner.next());
        scanner.close();
        System.out.println(n.isProbablePrime(10)?"prime":"not prime");
    }
}
