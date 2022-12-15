import java.text.SimpleDateFormat;
import java.util.Date;
public class SDFDemo{

	public static void main(String[] args) throws Exception{

		String str = "23/08/1997";

		SimpleDateFormat sdf  = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse(str);
		System.out.println(date);
	}
}