class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{

        int year=2016;
        Scanner sc=new Scanner (System.in);
         
        try
        {
             
            System.out.print("Enter year:");
            year=sc.nextInt();
             
            if((year%400==0)||(year%100!=0 && year%4==0))
                System.out.println(year+" is a Leap Year.");
            else
                System.out.println(year+" is not a Leap Year.");
        }
        catch (Exception Ex)
        {
            System.out.println("Oops ... : " + Ex.toString());
        }
	}
}
