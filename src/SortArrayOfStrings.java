import java.util.Scanner;

public class SortArrayOfStrings {
	private static String[] cities;
	private static Scanner input;
	
	public static void main(String [] args){
		input = new Scanner(System.in);
		int n=0;
		n=input.nextInt();
		String[] cities = new String [n];
		
		for (int i=0; i<cities.length; i++)
		{
			cities[i]= input.next();
		}
		
		sortStringBubble(cities);
		
		for (int i=0;i<cities.length;i++)
		{
			System.out.println(cities[i]);
		}
	}
	
	public static void sortStringBubble(String x[])
    {
          int j;
          boolean flag = true; 
          String temp;

          while (flag)
          {
                flag = false;
                for(j=0; j<x.length-1; j++)
                {
                        if(x[j].compareToIgnoreCase(x[j+1])>0)
                        {                                             
                                    temp = x[j];
                                    x[j] = x[j+1];      
                                    x[j+1] = temp;
                                    flag = true;
                         }
                 }
          }
    }
}
