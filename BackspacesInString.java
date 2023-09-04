public class BackspacesInString {
    public String cleanString(String s) {

        System.out.println(s);

        for (int i = s.length(); i > 0; i--) {

            if (s.charAt(i - 1) == '#') {
                System.out.println("Substring " + s.substring(0, i - 1));
                System.out.println("Substring2 " + s.substring(i));
                s = s.substring(0, i - 1);
            }
            System.out.println(s);
        }

        return s;
    }
}
