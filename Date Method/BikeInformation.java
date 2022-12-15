import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class BikeInformation{

	public static void bikeinfo(String str) throws Exception{

		Date date = new Date();

		String info = "Information about Bike Servicing, Insurance and Model expiry detail";

		SimpleDateFormat	sdf  = new SimpleDateFormat("dd/MM/yyyy");
                  	Date date1=sdf.parse(str);
		String fulldate = sdf.format(date1);
		System.out.println("\n"+info+"\n\n\tBike Registration / Bike Purchase Date : "+fulldate+"\n");

		SimpleDateFormat	sdf1 = new SimpleDateFormat("dd");
		String day = sdf1.format(date1);
	
		SimpleDateFormat	sdf2 = new SimpleDateFormat("MM");
		String m = sdf2.format(date1);
			
			int month = Integer.parseInt(m);
			
		SimpleDateFormat	sdf3 = new SimpleDateFormat("yyyy");
		String y = sdf3.format(date1);

			int year = Integer.parseInt(y);
			int n = 1;
			String s = "/";

			for(int i = 0; i < 5; i++){

				if(month > 10 ){	
					year++;
				}
				if(month > 10){
					month = month - 12;
				}

				month = month + 2;

				String ser = day+s+month+s+year;
				SimpleDateFormat	sdf4  = new SimpleDateFormat("dd/MM/yyyy");
                  			Date date2=sdf4.parse(ser);
				String serdate = sdf4.format(date2);
				System.out.println("\t\t>> "+n+"st bike servicing date : "+serdate);

				n++;
			}
		
		int year1 = Integer.parseInt(y);
		year1 = year1 + 5;
		String y1 = "";
		y1 = y1 + year1;
		String insurance = day+s+m+s+y1;
		SimpleDateFormat sdf5 = new SimpleDateFormat("dd/MM/yyyy");
		Date date3 = sdf5.parse(insurance);
		String insurancedate = sdf5.format(date3);
		System.out.println("\n\tBike insurance expiry date : "+insurancedate);

		int year2 = Integer.parseInt(y);
		year2 = year2 + 15;
		String y2 = "";
		y2 = y2 + year2;
		String model = day+s+m+s+y2;
		SimpleDateFormat sdf6 = new SimpleDateFormat("dd/MM/yyyy");
		Date date4 = sdf6.parse(model);
		String modelexpirydate = sdf6.format(date4);
		System.out.println("\n\tBike / Model expiry date : "+modelexpirydate);

	}

	public static void main(String... args) throws Exception{

		String str1= args[0];
		bikeinfo(str1);
		
	}
}