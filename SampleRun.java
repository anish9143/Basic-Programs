package Practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SampleRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Date objDate = new Date(); // Current System Date and time is assigned to objDate
		  System.out.println(objDate);
		  String strDateFormat = "hh:mm:ss a dd-MMM-yyyy"; //Date format is Specified
		  SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); //Date format string is passed as an argument to the Date format object
		  System.out.println(objSDF.format(objDate)); //Date formatting is applied to the current date
		  String format = objSDF.format(objDate);
		
	}

}
