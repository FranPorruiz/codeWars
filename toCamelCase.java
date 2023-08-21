class Solution {

    static String toCamelCase(String s) {
        String camelCase = "";
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == '_' || a == '-') {
                i++;
                char b = Character.toUpperCase(s.charAt(i));
                camelCase += b;
            } else {
                camelCase += a;
            }
        }
        return camelCase;
    }
}