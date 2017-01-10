package prob02;

import java.util.Scanner;

public class GoodsApp {
	public static void main(String[] args) {
		
		Goods[] array = new Goods[3];
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<3;i++){
			System.out.println(">>"+(i+1));
			System.out.println();
			System.out.print("상품명:");
			String name=scan.next();
			System.out.print("가격:");
			int price= scan.nextInt();
			System.out.print("제고:");
			int stock= scan.nextInt();
			array[i] = new Goods(name,price,stock);
				
		}
		
		for(Goods a : array){
			System.out.println(a+"가 입고되었습니다");
		}
		
	}
}
