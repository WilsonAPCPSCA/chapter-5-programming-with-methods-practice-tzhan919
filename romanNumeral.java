package romanNumerals;
import java.util.Scanner;
public class romanNumeral {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int input = in.nextInt();
	String display = output(input);
	System.out.println(display);
		
	}
	public static String romanDigit(int n, String one, String five, String ten){
	String result="";
	if(n==1){result= one;}
	else if (n==2){result=one +one;}
	else if (n==3){result=one+one+one;}
	else if (n==4){result=one +five;}
	else if (n==5){result=five;}
	else if (n==6){result=five +one;}
	else if (n==7){result=five+one+one;}
	else if (n==8){result=five +one+one+one;}
	else if (n==9){result=one+ten;}
	return result;
	}

	public static String output(int n){
	String romanOnes = romanDigit(n%10, "I", "V", "X");
	n=n/10;
	String romanTens = romanDigit(n%10, "X", "L", "C");
	n=n/10;
	String romanHundreds = romanDigit(n%10, "C", "D", "M");
	n=n/10;
	String romanThousands = romanDigit(n%10, "M", "V", "X");
	n=n/10;
	String romanHundredThousands = romanDigit(n%10, "X", "L", "C");
	n=n/10;
	String romanMillions = romanDigit(n%10, "C", "D", "M");
	return romanMillions + romanHundredThousands + romanThousands + romanHundreds + romanTens + romanOnes;
	}
}
