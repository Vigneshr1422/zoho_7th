package Zoho.Experience.Zoho_Images.ImageSet1;

public class FlippingDigit {
    public static void main(String[] args) {
        long n = 214871555L;

        // Flip all bits
        long ans = ~n;

        System.out.println(ans);
    }
}
/*
dei HR idha keta na straight-ah ithu bitwise NOT operator (~) concept test panranga.
Nee sollanum simple + clean explanation.
Na thanglish la ready-made answer kudukuren 👇

🔥 HR-ku solla correct answer (Thanglish + Simple English):

“In this program, we are using the bitwise NOT operator (~) to flip every bit of the number.
For example, in binary, 1 becomes 0 and 0 becomes 1.
So ~n returns the bitwise complement of n.
We are not reversing digits — we are flipping bits.”

🔍 Konjam deep-ah sollanum na:

“~n applies bitwise NOT.
Binary-la 214871555 oda representation la iruka bits ellame opposite aagum.
Unsigned range consider pannama Java signed long range-ah print pannum, so result negative varum.”

🧠 If HR ask: “Why negative value?”

“Because Java uses 2’s complement representation.
When all bits flipped, MSB (most significant bit) becomes 1 → so output turns negative.”

🟢 Super HR-friendly answer (Short & Clean):

“~n flips every bit in the binary representation of n.
That’s why the output becomes the bitwise complement, which looks negative in Java because of 2’s complement signed long.”
public class FlippingDigitBrute {
    public static void main(String[] args) {
        long n = 214871555L;
        long ans = 0;
        long mask = 1;

        for (int i = 0; i < 64; i++) {   // check each bit
            if ((n & mask) == 0) {       // if bit is 0 → set 1
                ans |= mask;
            }
            mask <<= 1;                   // move to next bit
        }

        System.out.println(ans);
    }
}

 */