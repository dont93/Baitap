package ptb2;

public class giaipt{
	private double a;
	private double b;
	private double c;
	private double delta;
	
	public giaipt(){}
	
	public giaipt(double d, double e, double f){
		a = d;
		b = e;
		c = f;
	}
	
	public String fgiaipt(){
			delta = (b * b) - (4 * a * c);
			if (delta > 0){
				return("Phuong trinh co 2 nghiem phan biet");
	        } 
			else if(delta == 0){
	            return("Phuong trinh co nghiem kep");
	        }
	        else {
	        	return("Phuong trinh vo nghiem");
	        }
	}

}
