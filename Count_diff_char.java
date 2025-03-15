package strings;
import java.util.Scanner;
public class Count_diff_char {
	public static void count_char(String s) {
		int vc=0,cc=0,sc=0,nc=0; //vc-vowel char,cc-consonants,sc-special char,nc-numeric char
		for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) {
		 if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'
    				||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
    		{
    			cc++;
    		}
    		else {
    			vc++;
    		}
		}
		else if(ch>='0'&&ch<='9') {
			nc++;
		}
		else {
			sc++;
		}
		}
		System.out.println("vc-"+vc);
		System.out.println("cc-"+cc);
		System.out.println("nc-"+nc);
		System.out.println("sc-"+sc);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	     System.out.println("enter string");
	     String s=scan.nextLine();
	     count_char(s);
	}
}
