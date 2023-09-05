public class p1 {
    public static void main(String[] args) {
        String s = "10#11#12";
        for(int i = 10; i <= 26; i++) {
            s = s.replaceAll(i + "#", (char)('a' + (i-1)) + "");
        }

        for(int i = 1; i <= 9; i++) {
            s = s.replaceAll(i + "", (char)('a' + (i-1)) + "");
        }

        System.out.println(s);
    }
}
