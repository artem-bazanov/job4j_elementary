package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = !(name.isEmpty() || Character.isUpperCase(name.codePointAt(0)) || Character.isDigit(name.codePointAt(0)));
        if (valid) {
            for (int i = 1; i < name.length(); i++) {
                if (isSpecialSymbol(String.valueOf(name.codePointAt(i)))
                        || isUpperLatinLetter(String.valueOf(name.codePointAt(i)))
                        || isLowerLatinLetter(String.valueOf(name.codePointAt(i)))
                        || Character.isDigit(Integer.parseInt(String.valueOf(i)))) {
                    valid = false;
                    break;
                }
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(String special) {
        boolean valid = true;
        for (int i = 0; i < special.length(); i++) {
            int code = special.codePointAt(i);
            if (code != 36 && code != 95) {
                valid = false;
                break;
            }
        }
        return valid;
    }

    public static boolean isUpperLatinLetter(String upper) {
        boolean valid = true;
        for (int i = 0; i < upper.length(); i++) {
            int code = upper.codePointAt(i);
            if (code < 65 || code > 90) {
                valid = false;
                break;
            }
        }
        return valid;
    }

    public static boolean isLowerLatinLetter(String lower) {
        boolean valid = true;
        for (int i = 0; i < lower.length(); i++) {
            int code = lower.codePointAt(i);
            if (code < 97 || code > 122) {
                valid = false;
                break;
            }
        }
        return valid;
    }
}
