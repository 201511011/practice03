package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		
		// 힌트: Scanner 와 String 클래스의 split 함수를 사용합니다.
		
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			
			/*  코드를 완성 합니다 */
			System.out.print(">>");
			String expression = scanner.nextLine();
			
			if(expression.equals("quit")){
				break;
			}
//			스페이스로 분리해낸다
			String[] tokens = expression.split(" ");
			
			switch(tokens[1]){
			
			case "+":{
				Add a = new Add();
				a.setValue(tokens[0], tokens[2]);
				int b = a.Add();
				System.out.println(b);
				break;
			}
			
			case "-":{
				Sub a = new Sub();
				a.setValue(tokens[0], tokens[2]);
				int b = a.sub();
				System.out.println(b);
				break;
			}
			
			case "*":{
				Mul a = new Mul();
				a.setValue(tokens[0], tokens[2]);
				int b = a.mul();
				System.out.println(b);
				break;
			}
			
			case "/":{
				Div a = new Div();
				a.setValue(tokens[0], tokens[2]);
				int b = a.div();
				System.out.println(b);
				break;
			}
			
			}
		}
		
		scanner.close();
	}
}
