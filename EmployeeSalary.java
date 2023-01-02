import java.util.Scanner;

public class EmployeeSalary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary");
		int salary = sc.nextInt();
		float tax = 1;
		int taxRate = 0;
		float HRA = (float) (0.15 * salary);
		float DA = (float) (0.6 * salary);
		if (salary <= 500000) {
			taxRate = 0;
			tax = (float) (salary * 0);
		} else if (salary >= 500001 && salary <= 1000000) {
			taxRate = 20;
			tax = (float) (salary * 0.20);
		} else {
			taxRate = 30;
			tax = (float) (salary * 0.30);
		}
		float netSalary = (salary - tax - HRA - DA);
		System.out.println("Employee HRA:" + HRA);
		System.out.println("Employee DA:" + DA);
		System.out.println("Employee tax:" + tax);
		System.out.println("Total Salary:" + netSalary);
	}
}
