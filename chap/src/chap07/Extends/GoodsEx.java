package chap07.Extends;

import java.util.Scanner;

public class GoodsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Goods good = new Goods();
//		
//		good.name = "����ƾ";
//		good.price = 13000;
//		good.nmberOfStock = 30;
//		good.sold = 50;
//		
//		
//		System.out.printf("��ǰ �̸� : %s\n",good.name);
//		System.out.printf("��ǰ ���� : %s\n",good.price);
//		System.out.printf("��� ���� : %s\n",good.nmberOfStock);
//		System.out.printf("�ȸ� ���� : %s\n",good.sold);
		
		
		Scanner scan = new Scanner(System.in);
		
		Goods[] goods = new Goods[3];
		
		for(int i = 0; i<goods.length; i++) {
			
			goods[i] = new Goods();
			goods[i].name = scan.next();
			goods[i].price = scan.nextInt();
			goods[i].nmberOfStock = scan.nextInt();
			goods[i].sold = scan.nextInt();
			
			
		}
		System.out.println("��ǰ�� ���� ��� �Ǹŷ�");
		for(int i = 0; i<goods.length; i++) {
			
			System.out.printf("%s %d %d %d\n",goods[i].name,goods[i].price,goods[i].nmberOfStock,goods[i].sold);
		}
	}

}
