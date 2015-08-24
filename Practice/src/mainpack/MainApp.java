/**
 * 
 */
package mainpack;

/**
 * @author kkum47
 *
 */


class Employee{
	public void netsal() {
		System.out.println("Employee Salary");
	}
}
class Confirmed extends Employee{
	public void netsal() {
		System.out.println("confirmed employee salary");
	}
	public void transport() {
		System.out.println("transport function");
	}
}
class Intern extends Employee{
	public void netsal() {
		System.out.println("Intern Stipend");
	}
}
class HR{
	public Employee recruit(String emp) {
		if (emp.equals("I")) {
			return new Intern();
		}
		else if (emp.equals("C")) {
			return new Confirmed();
		}
		return null;
	}
}
class Finance{
	public void processSal(Employee emp) {
		emp.netsal();
		if (emp instanceof Confirmed) {
			Confirmed cnf= (Confirmed) emp;
			cnf.transport();
		}
	}
}

enum Apple{
	Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
	private int price;
	Apple (int p){
		price= p;
	}
	int getprice(){
		return price;
	}
}


public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HR hr= new HR();
	Finance finance = new Finance();
	Employee employee= hr.recruit("C"); //upcast
	if (employee!=null) {
		finance.processSal(employee);
	}
	employee= hr.recruit("I");
	if (employee!=null) {
		finance.processSal(employee);
	}
	
	
	Apple ap;
	System.out.println("Here are all Apple constants");
	Apple allapples[]= Apple.values();
	for (Apple a : allapples) {
		System.out.println(a);
	}
	System.out.println();
	
	ap= Apple.valueOf("Winesap");
	System.out.println("ap contains "+ap);
	
	System.out.println("Winesap costs "+Apple.Winesap.getprice()+" Cents");
	System.out.println("All Apple Prices:");
	for (Apple a : Apple.values()) {
		System.out.println(a+" costs "+a.getprice()+" cents");
	}
	
	
}
	
}
		

