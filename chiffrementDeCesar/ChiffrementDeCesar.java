import java.util.Scanner;

public class ChiffrementDeCesar {
    static String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz" + "éèêàï" + "0123456789" + " !#$%&'()*+,-./:;<=>?@[]^_`{|}~";

    static String cryptage(String message,int cle) {
        char[] temporaire1 = new char [message.length()];
        int j=0;
        while (j != message.length()){
            for (int i = 0; i < 93; i++) {
                if (alphabet.charAt(i) == message.charAt(j)) {
                    temporaire1[j] = alphabet.charAt((i + cle) % 93);
                }
            }
            j++;
        }
        //String retourne1 = new String(temporaire1);
        return String.copyValueOf(temporaire1);
    }

    static String decryptage(String message,int cle) {
        char[] temporaire = new char [message.length()];
        int j = 0;
        while (j != message.length()){
            for (int i = 0; i < 93; i++) {
                if (alphabet.charAt(i) == message.charAt(j)) {
                    if (((i - cle) % 93) < 0){
                        temporaire[j] = alphabet.charAt((i - cle + 93) % 93);
                    }else {
                        temporaire[j] = alphabet.charAt((i - cle) % 93);
                    }
                }
            }
            j++;
        }
        //String retourne = new String(temporaire);
        return String.copyValueOf(temporaire);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez votre message:\t");
        String message = sc.nextLine();
        System.out.println();

        System.out.println("entrer la valeur de la cle:\t");
        int cle = sc.nextInt();
        System.out.println();

        System.out.println("Voulez vous:\n 1.crypter\n 2.decrypter");
        System.out.println();
        int choix = sc.nextInt();
        System.out.println();
        if (choix == 1){
            System.out.println(cryptage(message,cle));
        }else{
            System.out.println(decryptage(message,cle));
        }
    }
}
