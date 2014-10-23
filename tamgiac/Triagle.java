package tamgiac;

public class Triagle {

	private int a;
	private int b;
	private int c;
	
	public Triagle()
	{
		
	}
	
	public Triagle(int d, int e, int f)
	{
		a = d;
		b = e;
		c = f;
	}
	 public String fTriagle()
	 {
		 int IsATriangle;
		 if (( a < b + c ) && ( b < a + c ) && ( c < a + b ))
		 {
			 IsATriangle = 1;
		 }
			 else
			 {
				 IsATriangle = 0;
			 }
			 if (IsATriangle==1)
			 if (( a == b ) && ( b == c ))
				 return( "Triangle is Equilateral" );
			 else if (( a != b ) && ( a != c ) && ( b != c ))
				 return ( "Triangle is Scalene" );
			 else
				 return ( "Triangle is Isosceles" );
			 else
				 return ( "Not a Triangle" );
	 }
		
}

