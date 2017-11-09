package timeEnglish.java;
import java.util.Scanner;
public class TimeEnglish {

	public static void main(String[] args) {
	Scanner in= new Scanner (System.in);
	System.out.println("Enter the hours: ");
	int hours = in.nextInt();
	System.out.println("Enter the minutes: ");
	int minutes= in.nextInt();
	String output=getTimeName(hours,minutes);
	System.out.println(output);
	}
public static String getTimeName(int hours, int minutes)
{
	
	String result = "";
	if(minutes!=0&&minutes!=15&&minutes!=30&&minutes!=45)
	{
	result=minutes+" minutes past "+hours;
	}
	else if (minutes==0)
	{
	result=hours+" o'clock";
	}
	else if (minutes==30)
	{
	result="half past "+ hours;
	}
	else if (minutes==15)
	{
	result="quarter after "+ hours;
	}
	else if (minutes==45)
	{
	
	result="quarter to "+ (hours+1);
	}
	return result;
}
}
