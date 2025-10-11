class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x == 0) return true;

        int length = (int) Math.log10(x) + 1;

        for (int i = 0; i < length / 2; i++) {
            int leftDigit = (x / (int)Math.pow(10, length - i - 1)) % 10;
            int rightDigit = (x / (int)Math.pow(10, i)) % 10;

            if (leftDigit != rightDigit) return false;
        }

        return true;
    }
}

