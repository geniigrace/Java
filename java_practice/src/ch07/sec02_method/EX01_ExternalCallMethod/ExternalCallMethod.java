package ch07.sec02_method.EX01_ExternalCallMethod;

class A{
	void print() {
		System.out.println("Hi");
	}
	
	int data() {
		return 3;
	}
	
	double sum(int a,double b) {
		return a+b;
	}
	
	void printMonth(int m) {
		
		if(m<0||m>12) {
			System.out.println("잘못된 입력입니다.");
			return;
		}
		System.out.println(m+"월 입니다.");
	}
}
public class ExternalCallMethod {

	public static void main(String[] args) {
		A a =new A();
		
		a.print();
		int k=a.data();
		System.out.println(k);
		
		double result=a.sum(3, 3.5);
		System.out.println(result);
		a.printMonth(5);
		a.printMonth(15);
		
	}
	
}
