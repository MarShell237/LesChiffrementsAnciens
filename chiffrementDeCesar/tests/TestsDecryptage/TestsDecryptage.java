public class TestsDecryptage {

    static String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ ";


    public static void main(String[] args) throws Exception {
        String message = "LYXTYDA";
        char[] temporaire1 = new char [message.length()];
        int cle=10;
        int j=0;
        while (j != message.length()){
            for (int i = 0; i < 27; i++) {

                if (alphabet.charAt(i) == message.toUpperCase().charAt(j)) {
                    if((i - cle) < 0){
                        temporaire1[j] = alphabet.charAt((i - cle + 27) % 27);
                    }else{
                        temporaire1[j] = alphabet.charAt((i - cle) % 27);
                    }
                }
            }
            j++;
        }
        String retourne1 = new String(temporaire1); 
        System.out.print(retourne1);
    }

}
