package Coordinates;

public class Distance {

	private static double point;
	private static double point_b;
	
	private static double[] point_2;
	private static double[] point_2b;
	
	private static double[] point_3;
	private static double[] point_3b;
	
	/**
	 * Find the distance between two points once set
	 * @return
	 */
	public static double distance() {
		int i;
		double distance = 0;
		double a = 0;
		double ta = 0;
		double b = 0;
		double tb = 0;
		
		for (i = 0; i < point_2.length; i++) {
			a += point_2[i];
		}
		
		for (i = 0; i < point_2b.length; i++) {
			b += point_2b[i];
		}
		
		for (i = 0; i < point_3.length; i++) {
			tb += point_3[i];
		}
		
		for (i = 0; i < point_3b.length; i++) {
			ta += point_3b[i];
		}
		
		if (point != 0 && point_b != 0) {
			distance = point_b - point;
		} else if (a != 0 && b != 0) {
			distance = Math.sqrt(b) - Math.sqrt(a);
		}  else if (ta != 0 && tb != 0) {
			distance = Math.cbrt(b) - Math.cbrt(a); //Need cube root
		}
		
		return distance;
	}
	
	public static double getPoint() {
		return point;
	}

	public static void setPoint(double point) {
		Distance.point = point;
	}

	public static double getPoint_b() {
		return point_b;
	}

	public static void setPoint_b(double point_b) {
		Distance.point_b = point_b;
	}

	public static double[] getPoint_2() {
		return point_2;
	}

	public static void setPoint_2(double[] point_2) {
		Distance.point_2 = point_2;
	}

	public static double[] getPoint_2b() {
		return point_2b;
	}

	public static void setPoint_2b(double[] point_2b) {
		Distance.point_2b = point_2b;
	}

	public static double[] getPoint_3() {
		return point_3;
	}

	public static void setPoint_3(double[] point_3) {
		Distance.point_3 = point_3;
	}

	public static double[] getPoint_3b() {
		return point_3b;
	}

	public static void setPoint_3b(double[] point_3b) {
		Distance.point_3b = point_3b;
	}

}
