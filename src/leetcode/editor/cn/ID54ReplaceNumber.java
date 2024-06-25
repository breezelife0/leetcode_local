package leetcode.editor.cn;

import java.util.ArrayList;

public class ID54ReplaceNumber {
    public static void main(String[] args) {
        replaceNumber("");
    }


    public static String replaceNumber(String s) {
        if (s == null) {
            return "";
        }

        StringBuilder res = new StringBuilder();
        char[] charArray = s.toCharArray();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }


        for (int i = 0; i < charArray.length; i++) {
            if (list.contains(charArray[i])) {
                res.append("number");
            } else {
                res.append(charArray[i]);
            }
        }


        return res.toString();
    }

}
