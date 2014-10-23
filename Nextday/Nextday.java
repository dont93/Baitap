package nextday;
import java.util.Scanner;

public class Nextday {
	private int day;
	private int month;
	private int year;
	
	public Nextday()
	{
		
	}
	
	public Nextday(int d, int m, int y){
		day = d;
		month = m;
		year = y;
	}
	
	public String NextDate(){
	
		String date;
		Nextday tomorrow = new Nextday(this.day, this.month, this.year);
		
		if(this.month == 1 || this.month == 3 || this.month == 5 ||
		this.month == 7 || this.month == 8 || this.month == 10)
		{	
			if(this.day < 31)
			{
				tomorrow.day = this.day + 1;
			}
			else
			{
				tomorrow.day = 1;
				tomorrow.month = this.month + 1;
			}
		}
		if(this.month == 4 || this.month == 6 || this.month == 9 ||
		this.month == 11)
		{
			if(this.day < 30)
			{
				tomorrow.day = this.day + 1;
			}
			else
			{
				tomorrow.day = 1;
				tomorrow.month = this.month + 1;
			}
		}
		if(this.month == 12)
		{
			if(this.day < 31)
			{
				tomorrow.day = this.day + 1;
			}
			else
			{
				tomorrow.day = 1;
				tomorrow.month = 1;
			}
				if(this.year == 2012)
				System.out.print("2012 is over");
				else
				tomorrow.year = this.year + 1;
			}
			if(this.month == 2)
			{
				if(this.day < 28)
				{
					tomorrow.day = this.day + 1;
				}
				else
					if(this.day == 28)
					{
						if((this.year%4 == 0)&&(this.year%400 != 0))
						{
							tomorrow.day = 29;
						}
						else
						{
							tomorrow.day = 1;
							tomorrow.month = 3;
						}
					}
				else
					if(this.day == 29)
					{
						tomorrow.day = 1;
						tomorrow.month = 3;
					}
			}
			date = tomorrow.day + "/" +tomorrow.month +"/" + tomorrow.year;	
			return date;
			
						
	}

}
