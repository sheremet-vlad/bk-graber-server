package beer.fun.bet.util;

public final class StringFormatter {
    private StringFormatter() {

    }

    public static String getClassName(String stringClass) {
        return stringClass.substring(stringClass.lastIndexOf(".") + 1);
    }
}
