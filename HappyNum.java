import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        int result = 0;
        while(n != 1){
            //if the number is in the set already, then it is looping endlessly, and is not a happy number
            if(!seen.add(n))
                return false;

            result = 0;

            //squares the individual digits and adds them to the result
            while(n != 0){
                result += (n % 10) * (n % 10);
                n /= 10;
            }

            n = result;
        }
        return true;
    }
}