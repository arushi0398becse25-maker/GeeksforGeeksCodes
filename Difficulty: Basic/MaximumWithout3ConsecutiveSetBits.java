class Solution {
    public int maxValue(int n) {
        for (int i = 30; i >= 2; i--) {
            if ((n & (1 << i)) != 0 &&
                (n & (1 << (i - 1))) != 0 &&
                (n & (1 << (i - 2))) != 0) {
                n &= ~(1 << (i - 2));
            }
        }
        return n;
    }
}
