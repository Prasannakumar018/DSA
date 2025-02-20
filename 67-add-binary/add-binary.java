import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger num1 = new BigInteger(a, 2);  // Convert a to BigInteger
        BigInteger num2 = new BigInteger(b, 2);  // Convert b to BigInteger
        
        // Add the numbers
        BigInteger sum = num1.add(num2);
        
        // Convert the sum to binary string and return it
        return sum.toString(2);  // Convert sum back to binary string
    }
}
