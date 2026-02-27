class Solution {
    public boolean isPalindrome(int x) {
        
        // Negative numbers are not palindrome
        if (x < 0) return false;
        
        // If number ends in 0 but isn't 0 → not palindrome
        if (x % 10 == 0 && x != 0) return false;
        
        int reversedHalf = 0;
        
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }
        
        // For even digits: x == reversedHalf
        // For odd digits: x == reversedHalf / 10
        return x == reversedHalf || x == reversedHalf / 10;
    }
}