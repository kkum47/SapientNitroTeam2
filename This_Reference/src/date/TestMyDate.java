package date;

class MyDate{
	int dd;
	int yy;
	int mm;
	MyDate(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public MyDate addDays(int days){
	
		MyDate add = new MyDate(dd, mm, yy);
		add.dd+=days;
		return add;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return dd+" "+mm+" "+yy;
	}
}

public class TestMyDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyDate my_birth = new MyDate(22,7,1964);
		MyDate the_next_week = my_birth.addDays(7);
		
		System.out.println(my_birth);
		System.out.println(the_next_week);

	}

}
