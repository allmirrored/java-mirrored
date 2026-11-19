package edu.course;

public class TextUtils {
    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString().toUpperCase(java.util.Locale.ROOT);
    }
}
