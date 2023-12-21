class Coins {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = 25;
		int divRounded = a / b;
		int divMult = divRounded * b;
        int cents = a - divMult;
		System.out.println("Use " + divRounded + " quarters and " + cents + " cents");

	}
}