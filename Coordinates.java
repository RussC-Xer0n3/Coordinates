package Coordinates;

public class Coordinates {

	protected static final double zero_X = 0;
	protected static final double zero_Z = 0;
	protected static final double zero_Y = 0;
	protected static final double inf_max = Double.POSITIVE_INFINITY;
	protected static final double inf_min = Double.NEGATIVE_INFINITY;
	private static double x, y, z = 0;
	private static double mx, mz, my = 0;

	
	/**
	 * A single dimensional point
	 * 
	 * @param n
	 * @return
	 */
	public static double point (double n) {
		return n;
	}
	
	/**
	 * Creates a grid point in a two dimensions
	 * Accepts manual parameters or the parameters herein
	 * 
	 * @param x - width
	 * @param z - height
	 * @return
	 */
	public static double[] two_d_point (double x, double z) {
		double[] point = new double[2];
		
		point[0] = x;
		point[1] = z;
		
		return point;
	}
	
	/**
	 * Creates a grid point in a three dimensions
	 * Accepts manual parameters or the parameters herein
	 * 
	 * @param x - width
	 * @param z - height
	 * @param y - depth
	 * @return
	 */
	public static double[] three_d_point (double x, double z, double y) {
		double[] point = new double[3];
		
		point[0] = x;
		point[1] = z;
		point[2] = y;
		
		return point;
	}

	/**
	 * Produces an array of coordinates and inf_min in to dimensions
	 *
	 * point[0] = inf_min;
	 * point[1] = x;
	 * point[2] = z;
	 * 
	 * @param x
	 * @param z
	 * @param y
	 * @return
	 */
	public static double[] infinite_min_two_d (double x, double z) {
		
		double[] point = new double[3];
		
		point[0] = inf_min;
		point[1] = x;
		point[2] = z;
		
		return point;
	}
	
	/**
	 * Produces an array of coordinates and inf_min in three dimensions
	 * 
	 * point[0] = inf_min;
	 * point[1] = x;
	 * point[2] = z;
	 * point[3] = y;
	 * 
	 * @param x
	 * @param z
	 * @param y
	 * @return
	 */
	public static double[] infinite_min_three_d (double x, double z, double y) {
		
		double[] point = new double[4];
		
		point[0] = inf_min;
		point[1] = x;
		point[2] = z;
		point[3] = y;
		
		return point;
	}
	
	/**
	 * Produces an array of coordinates and inf_max in two dimensions
	 * 
	 * point[0] = inf_max;
	 * point[1] = x;
	 * point[2] = z;
	 * 
	 * @param x
	 * @param z
	 * @param y
	 * @return
	 */
	public static double[] infinite_max_two_d (double x, double z) {
		
		double[] point = new double[3];
		
		point[0] = inf_max;
		point[1] = x;
		point[2] = z;
		
		return point;
	}
	
	/**
	 * Produces an array of coordinates and inf_max in three dimensions
	 * 
	 * point[0] = inf_max;
	 * point[1] = x;
	 * point[2] = z;
	 * point[3] = y;
	 * 
	 * @param x
	 * @param z
	 * @param y
	 * @return
	 */
	public static double[] infinite_max_three_d (double x, double z, double y) {
		
		double[] point = new double[4];
		
		point[0] = inf_max;
		point[1] = x;
		point[2] = z;
		point[3] = y;
		
		return point;
	}
	
	/**
	 * Produces a mathematical grid of N size in two directions with a zero and minus values
	 * 
	 * grid[0][0] = zero_X;
	 * grid[0][1] = zero_Z;
	 * grid[1][0] = x;
	 * grid[1][1] = z;
	 * grid[2][0] = mx;
	 * grid[2][1] = mz;
	 *
	 * 
	 * @param x
	 * @param z
	 * @param mx
	 * @param mz
	 * @return
	 */
	public static double[][] two_d_grid (double x, double z, double mx, double mz) {
		double[][] grid = new double[2][2];
		
		grid[0][0] = zero_X;
		grid[0][1] = zero_Z;
		grid[1][0] = x;
		grid[1][1] = z;
		grid[2][0] = mx;
		grid[2][1] = mz;
		
		return grid;
	}
	
	/**
	 * Produces a mathematical grid of N size in three directions with a zero point and minus values
	 * 
	 * grid[0][0] = zero_X;
	 * grid[0][1] = zero_Z;
	 * grid[0][2] = zero_Y;
	 * grid[1][0] = x;
	 * grid[1][1] = z;
	 * grid[1][2] = y;
	 * grid[2][0] = mx;
	 * grid[2][1] = mz;
	 * grid[2][2] = my;
	 * 
	 * @param x
	 * @param z
	 * @param y
	 * @param mx
	 * @param mz
	 * @param my
	 * @return
	 */
	public static double[][] three_d_grid (double x, double z, double y, double mx, double mz, double my) {
		double[][] grid = new double[2][3];
		
		grid[0][0] = zero_X;
		grid[0][1] = zero_Z;
		grid[0][2] = zero_Y;
		grid[1][0] = x;
		grid[1][1] = z;
		grid[1][2] = y;
		grid[2][0] = mx;
		grid[2][1] = mz;
		grid[2][2] = my;
		
		return grid;
	}
	
	public static double getX() {
		return x;
	}

	public static double getY() {
		return y;
	}

	public static double getZ() {
		return z;
	}

	public static double getMx() {
		return mx;
	}

	public static void setMx(double mx) {
		Coordinates.mx = mx;
	}

	public static double getMz() {
		return mz;
	}

	public static void setMz(double mz) {
		Coordinates.mz = mz;
	}

	public static double getMy() {
		return my;
	}

	public static void setMy(double my) {
		Coordinates.my = my;
	}

	public static void setX(double x) {
		Coordinates.x = x;
	}

	public static void setY(double y) {
		Coordinates.y = y;
	}

	public static void setZ(double z) {
		Coordinates.z = z;
	}

}
