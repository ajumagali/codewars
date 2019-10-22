package  com.zuhlke;

/**
 * Hello world!
 *
 */
public class App
{
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
}
