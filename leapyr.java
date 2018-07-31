class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int year;
 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year");
        year = in.nextInt();
    
        if((year % 400 == 0) ||((year % 4 == 0) && (year % 100 != 0)))
             System.out.println("Leap Year");
        else
             System.out.println("not Leap Year");
	}
}
