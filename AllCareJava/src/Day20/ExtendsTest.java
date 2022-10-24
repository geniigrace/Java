package Day20;

import java.util.Scanner;

class Ramayon{
	String ramyon="라면";
	String water="물";
	String onion="파";
	
	void boilwater() {
		System.out.println(water+"을 끓인다.");
		
	}
	
	void cooking() {
		System.out.println(ramyon+"과 "+onion+"를 넣고 끓여 요리 완성 맛있게 드세요");
	}
}

class RiceRamyon extends Ramayon{
	String rice="떡";
	void topping() {
		System.out.println(rice+"를 넣는다");
	}
}


class CheeseRamyon extends Ramayon{
	
	String cheese ="치즈";
	void topping() {
		System.out.println(cheese+"를 넣는다");
	}
	
}
public class ExtendsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int s;
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.print("만들고 싶은 요리를 입력하세요\n1.일반라면 2.떡라면 3.치즈라면 99.종료");
	
		s=sc.nextInt();
		if(s==1) {
			Ramayon r= new Ramayon();
			r.boilwater();
			r.cooking();
		}
		else if(s==2) {
			
			RiceRamyon rr = new RiceRamyon();
			rr.boilwater();
			rr.topping();
			rr.cooking();
			
		}
		else if(s==3) {
			
			CheeseRamyon cr = new CheeseRamyon();
			cr.boilwater();
			cr.topping();
			cr.cooking();
			
		}
		else if(s==99) {
			System.out.println("감사합니다.");
			break;
			
		}
		else {
			System.out.println("잘못된 입력입니다.");
			
		}
	
	
	
	}
		
	}

}
