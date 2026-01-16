package AdvanceJavaTasks;

public class MoveHyphensToFront {
    public static void main(String[] args) {
        String str = "String-Compare";

        System.out.println(moveHyphens(str));
    }

    static String moveHyphens(String str) {
        if (str == null)
            return null;

        StringBuilder hyphens = new StringBuilder();
        StringBuilder chars = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch == '-')
                hyphens.append(ch);
            else
                chars.append(ch);
        }

        return hyphens.append(chars).toString();
    }
}

