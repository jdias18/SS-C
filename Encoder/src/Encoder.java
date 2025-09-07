/**
 * Class Econder to support enconding methods.
 */
public class Encoder {

    /**
     * First encode implementation - handling exception
     * @param str
     * @return String
     */
    protected static String encode(char[] str) {
        char currentChar = str[0];
        int count = 1;
        String output = "";
        for (int i = 0; i < str.length; i++) {
            try {
                if (currentChar == str[i+1]) {
                    count++;
                } else {
                    output = output + currentChar + count;
                    count = 1;
                    currentChar = str[i+1];
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                output = output + currentChar + count;
            }
        }
        return output;
    }

    /**
     * Second endonde implementation - without exception handling.
     * @param str
     * @return String
     */
    protected static String encode2(char[] str) {
        char currentChar = str[0];
        int count = 1;
        String output = "";
        for (int i = 0; i < str.length; i++) {
            if(i+1 < str.length) {
                if (currentChar == str[i+1]) {
                    count++;
                } else {
                    output = output + currentChar + count;
                    count = 1;
                    currentChar = str[i+1];
                }
            } else {
                output = output + currentChar + count;
            }
        }
        return output;
    }
}
