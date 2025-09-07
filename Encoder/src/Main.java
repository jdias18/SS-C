/**
 * Main class.
 */
public class Main {
    public static void main(String[] args) {
        String input1 = "aaaabbbccc";
        String input2 = "abbbcdddd";
        String input3 = "wwwwaaadexxxxxx";

        System.out.println("Encode1:");
        System.out.println(Encoder.encode(input1.toCharArray()));
        System.out.println(Encoder.encode(input2.toCharArray()));
        System.out.println(Encoder.encode(input3.toCharArray()));

        System.out.println("Encode2:");
        System.out.println(Encoder.encode2(input1.toCharArray()));
        System.out.println(Encoder.encode2(input2.toCharArray()));
        System.out.println(Encoder.encode2(input3.toCharArray()));
    }
}

