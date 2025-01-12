//06
import java.util.*;

class CheckOTP {
    public static void main(String[] args) {
        //creating array of integer type to store OTPs.
        int[] otps = new int[10];
        boolean isUnique = true;

        // Generating 10 OTPs
        for (int i = 0; i < 10; i++) {
            otps[i] = (int)(Math.random() * 900000) + 100000; // Generate 6-digit OTP
        }

        // Checking uniqueness of the OTPs
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (!isUnique) break;
        }

        // Printing OTPs and result
        System.out.println("Generated OTPs: " + Arrays.toString(otps));
        System.out.println("Are all OTPs unique? " + isUnique);
        
    }
}
