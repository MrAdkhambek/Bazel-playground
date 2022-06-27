package me.adkhambek.print;

import lombok.NonNull;

public final class PrintUtil {

    private PrintUtil() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static void println(String value) {
        System.out.println(value);
    }

    @NonNull
    public static String toTitleCase(@NonNull String in) {
        if (in.isEmpty()) return in;
        return "" + Character.toTitleCase(in.charAt(0)) + in.substring(1).toLowerCase();
    }
}
