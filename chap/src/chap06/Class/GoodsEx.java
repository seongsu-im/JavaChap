package chap06.Class;

import java.util.Scanner;

class Goods {

	String name;
	int price;
	int numberOfstock;
	int sold;

}


public class GoodsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Goods shampoo = new Goods();
				shampoo.name = "����ƾ";
				shampoo.price = 13000;
				shampoo.numberOfstock = 30;
				shampoo.sold = 50;
				System.out.println("상품 이름: "+shampoo.name);
				System.out.println("상품 가격 : "+shampoo.price);
				System.out.println("재고 수량 : "+shampoo.numberOfstock);
				System.out.println("팔린 수량 : "+shampoo.sold);


	Scanner scan = new Scanner(System.in);

		Goods[] gArray = new Goods[3]; 


		for(int i =0; i<gArray.length; i++) {


		gArray[i]= new Goods();	
			gArray[i].name = scan.next();
		gArray[i].price = scan.nextInt();
			gArray[i].numberOfstock = scan.nextInt();
		gArray[i].sold = scan.nextInt();

		}
		
	System.out.println("��ǰ��\t����\t���\t�Ǹŷ�");
		for(int i =0; i<gArray.length; i++) {
		System.out.printf("%s\t%d\t%d\t%d\n", gArray[i].name,gArray[i].price,gArray[i].numberOfstock,gArray[i].sold);	
			
	}
		
		
		
		
		
		
	}

}
