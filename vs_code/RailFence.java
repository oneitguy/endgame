public class railfence {
    public static void main(String[] args) {
        String input = "Good afternoon my name is Parth.";
        String cipherText = encryptRailFence(input);
        System.out.println("Cipher text: " + cipherText);
    }

    public static String encryptRailFence(String text) {
        StringBuilder row1 = new StringBuilder();
        StringBuilder row2 = new StringBuilder();

        // Arrange characters in rail fence pattern
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 == 0)
                row1.append(text.charAt(i));  // Even index - First row
            else
                row2.append(text.charAt(i));  // Odd index - Second row
        }

        return row1.toString() + row2.toString();
    }
}
