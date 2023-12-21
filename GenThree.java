class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		double x = Math.random();
	    double y = Math.random();
	    double z = Math.random();
		x = x*((b - a)) + a;
		y = y*((b - a)) + a;
		z = z*((b - a)) + a;
		x = Math.round(x);
		y = Math.round(y);
		z = Math.round(z);
		int min = (int)Math.min(Math.min(x, y), z);
		System.out.println((int)x);
        System.out.println((int)y);
        System.out.println((int)z);
		System.out.println("The minimal generated number was " + min);
	}
}
