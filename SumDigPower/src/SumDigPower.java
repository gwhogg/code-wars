import java.util.ArrayList;
import java.util.List;

class SumDigPower {

    public static void main(String[] args) {
        List<Long> result = sumDigPow(10L,150L);
        System.out.println(result);
    }

    public static List<Long> sumDigPow(long a, long b) {
        List<Long> hits = new ArrayList<>();

        for (long i = a; i < b; i++) {
            // All single digit numbers > 0 satisfy the condition
            if(i <= 9L) {
                hits.add(i);
            } else {
                Integer digitsToPowersSum = 0;
                String numStr = String.valueOf(i);
                char[] digits = numStr.toCharArray();
                for (int j = 0; j < digits.length ; j++) {
                    Double digit = Double.parseDouble(Character.toString((char)digits[j]));
                    digitsToPowersSum += (int)Math.pow(digit, (double)(j+1));
                }
                if((long)digitsToPowersSum == i){
                    hits.add(i);
                }
            }
        }

        return hits;
    }
}