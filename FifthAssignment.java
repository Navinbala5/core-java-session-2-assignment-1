public class FifthAssignment {

	public static void main(String[] args) {



int size=5;
	int	ls=0;
	int	rs=2*size-3;
	
		
		for (int i=0;i<size;i++)
		{
			
		for(int j=0;j<ls;j++)
		
			System.out.print("_");
			System.out.print("*");
		
	
          if(i!=size/2)
          {
        	  for(int k=0;k<rs;k++)
        		  System.out.print("_");
  			System.out.print("*");
          }
          if(i<size/2)
          {
        	  ls+=2;
        	  rs-=4;
          }
          else
          {
        	 
        	  ls-=2;
        	  rs+=4;
	      }
          System.out.print("\n");
	
		}
	
	}
}
	
