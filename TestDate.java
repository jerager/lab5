import java.util.Scanner;


public class TestDate {

    public static void main(String[] args) {
		
	new TestDate().go();
    }

    private void go() {
	String tests = "January 31 2001 Gregorian " +
	    "February 28 2000 Gregorian " +
	    "February 29 2000 Gregorian " +
	    "February 28 1999 Gregorian " +
	    "February 29 1999 Gregorian " +
	    "March 31 1988 Gregorian " +
	    "April 30 2103 Gregorian " +
	    "May 15 1599 Gregorian " +
	    "June 12 1600 Gregorian " +
	    "December 31 1642 Gregorian " +
	    "December 13 2001 Gregorian ";
		
	Scanner sc = new Scanner(tests);
		
	DateFactory df = new DateFactory();
		
	while (sc.hasNext()) {
	    String month = sc.next();
	    int day = sc.nextInt();
	    int year = sc.nextInt();
	    String location = sc.next();
			
	    GregorianDate gd = df.createDate(month,day,year,location);
	    System.out.println();
	    System.out.println(gd);
	    gd.makeTomorrow();
	    System.out.println(gd);
			
	}
    }
	
}

