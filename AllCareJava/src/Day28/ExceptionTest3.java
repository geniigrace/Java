package Day28;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num =0;
		int flag = 0;
		
		while(flag == 0) {
			flag = 1;
			try {
				System.out.print("숫자 입력 : ");
				num=sc.nextInt();
				System.out.println("입력 받은 숫자는 "+num+" 입니다.");
			}
			catch(InputMismatchException e) {
				flag = 0;
				sc.nextLine();
				System.out.println("정상적인 숫자를 입력하세요");
				
			}
		}

	}

}
