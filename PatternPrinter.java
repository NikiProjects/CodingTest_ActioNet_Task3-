package Task3;

public class PatternPrinter {

	int storeIndexValue;
	int storeIndexValue2;
	
	public void printPattern(int arg)
	{
		
		
		for(int k = 1; k <= arg; k++)
		{
			storeIndexValue2 = k;
			while(storeIndexValue2 < arg)
			{
				System.out.print(".");
				storeIndexValue2++;
				
			}	
		storeIndexValue = k;
			while(storeIndexValue > 0)
			{	
				System.out.print(k);
				storeIndexValue--;
			}
			
		System.out.println("   ");
		
		}
		
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		
			PatternPrinter pp = new PatternPrinter();
					pp.printPattern(10);
	}

}
