public class Question15 {
	class MyPoint {
		void myMethod() {
			int x, y;
			x = 5;
			y = 3;
			System.out.print(" ( " + x + ", " + y + " ) ");
			switchCoords(x, y);
			System.out.print(" ( " + x + ", " + y + " ) ");
		}

		void switchCoords(int x, int y) {
			int temp;
			temp = x;
			x = y;
			y = temp;
			System.out.print(" ( " + x + ", " + y + " ) ");
		}
	}

}
