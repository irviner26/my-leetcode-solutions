class Solution {
    public int romanToInt(String s) {
        char[] symbolRoman = {'I','V','X','L','C','D','M'};
        int[] valueRoman = {1, 5, 10, 50, 100, 500, 1000};
        int[] saveValue = new int[s.length()];
        int realValue = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            for (int j = 0; j <= symbolRoman.length - 1; j++) {
                if (s.charAt(i) == symbolRoman[j]) {
                    saveValue[i] = valueRoman[j];
                }
            }
        }
        realValue = realValue + saveValue[0];
        for (int k = 1; k <= saveValue.length - 1; k++) {
            if (saveValue[k] > saveValue[k-1]) {
                realValue = realValue + saveValue[k] - 2*saveValue[k-1];
            }
            else {realValue = realValue + saveValue[k];}
            // realValue = realValue + saveValue[k]
        }
        return realValue;
    }
}
