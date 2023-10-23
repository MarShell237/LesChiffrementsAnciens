import java.util.Scanner;
public class DechiffrementCesar{
	public static void main(String[] args) {
	System.out.println("entrez le message a dechiffrer en minuscule");
	Scanner sc1=new Scanner(System.in);
	String message=sc1.nextLine();
	for(int i =0;i<message.length(); i++){
	    
	char c= (message.charAt(i));
	if(c<'d')
	switch(c){
	case 'a':
	c =(char)120;
	break;
	case 'b':
	c=(char)121;
	break;
	default:
	c=(char)122;
	}
	else{
	    c =(char)(c-3);
	}
	
	
	System.out.print(c);//122
	}
	}
}