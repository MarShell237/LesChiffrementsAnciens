public class TestsCryptage {

    static String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ ";


    public static void main(String[] args) {
        String message = "Bonjour";
        char[] temporaire1 = new char [message.length()];
        int cle=10;
        int j=0;
        while (j != message.length()){
            for (int i = 0; i < 27; i++) {
                if (alphabet.charAt(i) == message.toUpperCase().charAt(j)) {
                    temporaire1[j] = alphabet.charAt((i + cle) % 27);
                }
            }
            j++;
        }
        String retourne1 = new String(temporaire1); 
        System.out.print(retourne1);
    }

}
