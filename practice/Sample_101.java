class Sample_101 {

    public static void main(String[] args) {
        String s1 = "Radar"; // Fixed the input string to make it a palindrome
        String s2 = "";

        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }

        if (s1.toLowerCase().equals(s2.toLowerCase())) {
            System.out.println(s1 + " is a string palindrome");
        } else {
            System.out.println(s1 + " is not a string palindrome");
        }
    }
}
