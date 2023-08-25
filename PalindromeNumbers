class Solution {
    public boolean isPalindrome(int x) {
        // Handle the negative
        if ( x < 0 ) {
            return false;
        }
        // check no. of digits by using this
        int checkX = x;
        int numberofDigits=0;
        do{
            numberofDigits++;
            checkX = checkX / 10;
        } while ( checkX != 0 );
        
        if (numberofDigits >= 2) {
            // Last digit:
        int lastDigit = x % 10;
        for (int l = 0; l < numberofDigits - 1; l++) {
            lastDigit *= 10;
        }

        // First digit:
        int firstDigit = x;
        for (int i = 0; i < numberofDigits - 1; i++) {
            firstDigit = firstDigit / 10;
        }

        // Rest of the digit:
        int moduloNumber = 100;
        int dividerNumber = 10;
        int multiplierNumber = 1;
        // hehe lmao
        for (int j = 0; j < numberofDigits - 2; j++) {
            multiplierNumber *= 10;
        }
        // hehe lmao
        int res = 0;
        for (int k = 0; k < numberofDigits - 2; k++) {
            res = res + (x % moduloNumber)/dividerNumber * multiplierNumber;
            moduloNumber *= 10;
            dividerNumber *= 10;
            multiplierNumber /= 10;
        }

        int xx = lastDigit + res + firstDigit;

        if (xx == x) {
            return true;
        }
        return false;
        }
        else {
            return true;
        }
        
    }
}
