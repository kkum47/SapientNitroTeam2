package mainpack;


class Data {
	int firstNumber;	
	int secondNumber;
	public int getFirstNumber(){
		return firstNumber;
	}
	public int getSecondNumber(){
		return secondNumber;
	}
	public void setFirstNumber(int firstNumber){
		this.firstNumber = firstNumber;
	}
	public void setSecondNumber(int secondNumber){
		this.secondNumber = secondNumber;
	}
	@Override
	public boolean equals(Object obj) {
		Data d = (Data) obj;
		if (firstNumber==d.firstNumber) {
			if (secondNumber==d.secondNumber) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
}


public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d1 = new Data();
		Data d2 = new Data();
		
		d1.setFirstNumber(2);
		d1.setSecondNumber(4);
		d2.setFirstNumber(2);
		d2.setSecondNumber(4);
		
		System.out.println(d1.equals(d2));
		
	}

}
