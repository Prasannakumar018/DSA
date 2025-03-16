class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {

        Arrays.sort(tokens);
        if(tokens.length==0 || tokens[0]>power ) return 0;

        
        int score=0,maxi=0;
        int left = 0, right = tokens.length - 1;

        while (left <= right) {
            // If we have enough power to play the token face-up
            if (power >= tokens[left]) {
                power -= tokens[left];  // Decrease power
                score++;  // Increase score
                left++;  // Move the left pointer to the next token
                maxi = Math.max(maxi, score);  // Update maximum score
            } 
            // If we can't play face-up but we have a score, play face-down to regain power
            else if (score > 0) {
                power += tokens[right];  // Regain power by playing the largest token
                score--;  // Decrease score
                right--;  // Move the right pointer to the previous token
                maxi = Math.max(maxi, score);  // Update maximum score
            } 
            // If neither condition is met, break out of the loop
            else {
                break;
            }
        }

        return maxi;
    }
}


