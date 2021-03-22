package chap08.Interface;

interface AA {
	void method1();
	default void method2() {

	}


	class Old implements AA{

		@Override
		public void method1() {
			// TODO Auto-generated method stub

		}
	}

	class New implements AA{

		@Override
		public void method1() {

		}
		@Override
		public void method2() {

		}

	}

}