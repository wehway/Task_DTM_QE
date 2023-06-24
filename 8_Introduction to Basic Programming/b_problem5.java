public class b_problem5 {
    private static String encryptText(String text) {
        String alphabetBob = "KLMNOPEFGHIJ";
        String alphabetStandar = "ABCDEF—_UVWXYZ";
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            int index = alphabetStandar.indexOf(Character.toUpperCase(currentChar));

            if (index != -1) {
                char encryptedChar = alphabetBob.charAt(index);
                encryptedText.append(encryptedChar);
            } else {
                encryptedText.append(currentChar);
            }
        }

        return encryptedText.toString();
    }

    public static void main(String[] args) {
        System.out.println(encryptText("SEPULSA OKE")); // COZEVCK YUO
        System.out.println(encryptText("ALTERRA ACADENT")); // KYDOKK NORT
        System.out.println(encryptText("INDONESIA")); // SKYROSA
        System.out.println(encryptText("GOLANG")); // QYVKXQ
        System.out.println(encryptText("PROGRAMMER")); // GNOBRAMMER
    }

}
