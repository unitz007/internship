package org.assignment;

public class QuestionFour {

    public int firstIndexOfSubstring(String val, int start, int end) {
        char[] c = val.toCharArray();

        for (int i = start; i <= c.length; i++) {
            if (i == start) {
                return i;
            }
        }

        return 0;
    }

}
