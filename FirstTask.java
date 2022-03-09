import java.nio.charset.StandardCharsets;
import java.util.*;
public class FirstTask {
    public static void main(String[] args) {
        printVampireNumbers(100);
    }

    static int lengthOfNum(Long num){
        return Long.toString(Math.abs(num)).length();
    }

    static boolean checkVampire(long num, long n1, long n2){
        if(Long.toString(n1).endsWith("0") && Long.toString(n2).endsWith("0")) return false;

        int len = lengthOfNum(num);
        if(lengthOfNum(n1) != len/2 || lengthOfNum(n2) != len/2) return false;
        char[] numByte = Long.toString(num).toCharArray();
        char[] n1n2Byte = (Long.toString(n1) + Long.toString(n2)).toCharArray();

        Arrays.sort(numByte);
        Arrays.sort(n1n2Byte);
        return Arrays.equals(numByte, n1n2Byte);

    }

    static void printVampireNumbers(long n){
        int count = 0;
        for(long i = 10; count <= n; i++){
            if(lengthOfNum(i)%2 == 0) {

                for (long n1 = 2; n1 <= Math.sqrt(i) + 1; n1++) {
                    if (i % n1 == 0) {
                        long n2 = i / n1;
                        if (checkVampire(i, n1, n2) && n1 <= n2) {
                            count++;
                            System.out.println(i);
                        }
                    }
                }
            }
        }
    }

}