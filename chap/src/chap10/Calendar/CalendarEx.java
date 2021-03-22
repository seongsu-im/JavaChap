package chap10.Calendar;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calendar now = Calendar.getInstance();
		
		System.out.println(now.get(Calendar.YEAR)); // 2021��
		System.out.println(now.get((Calendar.MONTH))+1); //3�� 
		System.out.println(now.get(Calendar.DATE));
		System.out.println(now.get(Calendar.DAY_OF_WEEK)); // ����  1--> �Ͽ��� 
		System.out.println(now.get(Calendar.HOUR)); //���� �� // 9��
		System.out.println(now.get(Calendar.AM_PM)); //0�� ���� 1�� ����
		System.out.println(now.get(Calendar.MINUTE)); 
		
		System.out.println("현재는: " + now.getTime());
		now.add(Calendar.DATE,-15);
		System.out.println("15일 전은: " + now.getTime());
		now.add(Calendar.DATE,-15);
		System.out.println("15일 전은: " + now.getTime());
		now.add(Calendar.MONTH,4);
		System.out.println("4개월 후는: " + now.getTime());
		now.add(Calendar.YEAR,2);
		System.out.println("2년 후는: " + now.getTime());
		
		
		
		Calendar firstDate = Calendar.getInstance(); // ���� �ð��� ���� ����
		firstDate.clear();
		firstDate.set(2019,11,25);
		firstDate.set(Calendar.HOUR_OF_DAY,19);
		System.out.println(firstDate.getTime());
		
	}

}
