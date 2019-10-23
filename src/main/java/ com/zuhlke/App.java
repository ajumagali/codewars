package  com.zuhlke;


public class App
{

    /**
     * Complete the solution so that it strips all text that follows any of a set of comment markers passed in.
     * Any whitespace at the end of the line should also be stripped out.
     */
    public static String stripComments(String text, String[] commentSymbols) {
        String textArray[] = text.split("\n");
        String output = "";

        for (int i=0; i<textArray.length; i++) {
            for (String symbol : commentSymbols) {
                if (textArray[i].contains(symbol)) {
                    textArray[i] = textArray[i].substring(0, textArray[i].indexOf(symbol));

                }
            }
            output += textArray[i].replaceAll("\\s+$", "") + "\n";
        }

        output = output.substring(0, output.lastIndexOf("\n"));
        return output;
    }

    /**
     * Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence,
     * which is the number of times you must multiply the digits in num until you reach a single digit.
     */
    public static int persistence(long n) {
        int numberOfMultiplications = 0;
        if (n/10 == 0) return numberOfMultiplications;
        else {
            long tmp = multiplicationOfDigits(n);
            numberOfMultiplications++;
            while (tmp /10 != 0) {
                tmp = multiplicationOfDigits(tmp);
                numberOfMultiplications++;
            }
        }

        return numberOfMultiplications;

    }

    public static long multiplicationOfDigits(long n) {
        long multiplication = 1;

        while (n != 0) {
            multiplication *= n%10;
            n = n/10;
        }

        return multiplication;
    }

}
