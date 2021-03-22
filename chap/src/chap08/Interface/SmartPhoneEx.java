package chap08.Interface;

interface MyButton{

	void click();

}

//class CallBtn implements MyButton{
//	@Override
//	public void click() {
//		// TODO Auto-generated method stub
//		System.out.println("��ȭ��ư�� ������");
//		
//	}
//}
//
//
//class StopBtn implements MyButton{
//	@Override
//	public void click() {
//		// TODO Auto-generated method stub
//		System.out.println("��ȭ��ư�� ������");
//		
//	}
//}


public class SmartPhoneEx {

	public static void main(String[] args) {

//		CallBtn btncall = new CallBtn();
//		btncall.click();
//		StopBtn btncall = new StopBtn();
//		btncall.click();

		MyButton btncall = new MyButton() {

			public void click() {

				System.out.println("��ȭ��ư ������");
			}

		};
		
		btncall.click();
		
		MyButton btnStop = new MyButton() {

			public void click() {

				System.out.println("�����ư�� ������");
			}

		};
		btnStop.click();
	}

}
