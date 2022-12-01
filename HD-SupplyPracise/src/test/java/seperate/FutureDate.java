package seperate;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;  

public class FutureDate {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
		boolean dataFound=true;
		int a=0;
		while(dataFound){
		int data=-10;
		cal.add(Calendar.DATE, data);
		Date d=cal.getTime();
		String dd=sdf.format(d);
		System.out.println("MM/dd/yyyy:: "+dd);
		data=data-10;
		a++;
		System.out.println(a);
		if(a==5) {
			dataFound=false;
		}
		}
		
		
	   
		

	}

	

}
