import java.util.Date;
public class DateTest{

	public static void main(String[] args){

		Date date = new Date();
		System.out.println(date);

		Date date2 = new Date();
		System.out.println(date2);

		long time = date.getTime();
		System.out.println("Time in ms : "+time);

		int year = date.getYear();
		System.out.println(year);

		int day = date.getDay();
		System.out.println(day);

		int minutes = date.getMinutes();
		System.out.println(minutes);

		int seconds = date.getSeconds();
		System.out.println(seconds);
		
	}
}