class Solution {
    public int reverse(int x) {

        int a= x>0 ? 1: -1;
         x = Math.abs(x);
        String rev= Integer.toString (x);
        String result="";
        for(int i=rev.length()-1; i>=0 ;i--){
            result= result+rev.charAt(i);
        }  
        
        try {
            int reversed = a * Integer.parseInt(result);  // Parse the result back to an integer
            // Check for overflow after parsing
            if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
                return 0;
            }
            return reversed;
        } catch (NumberFormatException e) {
            return 0;  // In case of overflow or invalid input
        }
    }
}
