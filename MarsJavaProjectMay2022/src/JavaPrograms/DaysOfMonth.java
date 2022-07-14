package JavaPrograms;



import java.time.YearMonth;
import java.time.*;




public class DaysOfMonth {

 public  String findDays(int year1 ,int month1)
{
	String month;
	 YearMonth yearMonthObject = YearMonth.of(year1, month1);
	 switch(month1)
	 {
	 case 1: month = "January";
			 break;
	 case 2: month = "February";
			 break;
	 case 3: month= "March";
			 break;
	 case 4: month= "April";
			 break;
	 case 5: month= "May";
			 break;
	 case 6: month= "June";
	         break;
	 case 7: month= "July";
			 break;
	 case 8: month= "August";
			 break;
	 case 9: month= "September";
			 break;
	 case 10: month= "October";
			 break;
	 case 11: month= "November";
			 break;
	 case 12: month= "December";
			 break;
	 default: month="";
	 }
     int daysInMonth = yearMonthObject.lengthOfMonth();
     return ("There are "+ daysInMonth +" days in "+month+" "+year1);
			
}


}