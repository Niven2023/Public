import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CarNumberReplacement {
    private static final String CAR_NUMBER_REGEX = "\\b[А-ЯІЇЄ]{2} \\d{4} [А-ЯІЇЄ]{2}\\b|\\b[А-ЯІЇЄ]{2}\\d{4}[А-ЯІЇЄ]{2}\\b|\\b\\d{3}-\\d{2} [А-ЯІЇЄ]{2}\\b";

    public String replaceCarNumbers(String input) {
        Pattern pattern = Pattern.compile(CAR_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(input);

        StringBuffer output = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(output, "CAR_NUMBER");
        }
        matcher.appendTail(output);

        return output.toString();
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java CarNumberReplacement <text>");
            return;
        }

        String inputText = args[0];

        CarNumberReplacement carNumberReplacement = new CarNumberReplacement();
        String result = carNumberReplacement.replaceCarNumbers(inputText);
        System.out.println(result);
    }
}