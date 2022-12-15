import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class YogeshBirthdayWish {
	public static void main(String[] args) throws ParseException {
		Date date  = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String currentDate = sdf.format(date);
		Date birthdayDate = sdf.parse("02-03-2020");
		String birthDate = sdf.format(birthdayDate);
		
			if(currentDate.equals(birthDate)) {
				System.out.println("Happy Birthday Yogesh");
			} else {
				System.out.println((23 - date.getHours()) + " hours ");
			}
	}
}