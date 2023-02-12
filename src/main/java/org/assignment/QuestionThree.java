package org.assignment;

public class QuestionThree {

    private char toUpperCase(char lowerCase) {
        return Character.toUpperCase(lowerCase);
    }

    private char toLowerCase(char upperCase) {
        return  Character.toLowerCase(upperCase);
    }

    public String convert(String value) {

        char[] chars = value.toCharArray();
        char[] charArray = new char[value.length()];

        for (int i = 0; i <= chars.length; i++) {
            if (Character.isUpperCase(chars[i])) {
                charArray[i] = toLowerCase(chars[i]);
                break;
            }

            if (Character.isLowerCase(chars[i])) {
                charArray[i] = toUpperCase(chars[i]);
            }
        }


        return String.valueOf(charArray);
    }

}
