import java.util.Scanner;
public class ChiffrementCesar{
	public static void main(String[] args) {
	System.out.println("entrez le message a chiffrer en minuscule");
	Scanner sc1=new Scanner(System.in);
	String message=sc1.nextLine();
		for(int i =0;i<message.length(); i++){
			
			char c= (message.charAt(i));
			if(c>'w')
			switch(c){
				case 'x':
					c =(char)97;
					break;
				case 'y':
					c=(char)98;
					break;
				default:
					c=(char)99;
			}
			else{
				c =(char)(c+3);
			}
			System.out.print(c);//122
		}
	}
}