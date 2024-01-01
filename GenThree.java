/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int max = Integer.parseInt(args[0]);
        int min = Integer.parseInt(args[1]);
        double rnd1 = ((Math.random() * (max - min)) + min);
        double rnd2 = ((Math.random() * (max - min)) + min);
        double rnd3 = ((Math.random() * (max - min)) + min);
        System.out.println((int)rnd1);
        System.out.println((int)rnd2);
        System.out.println((int)rnd3);
        //caculating the smallest number
        double mn1 = Math.min(rnd1, rnd2);
        double mn2 = Math.min(rnd3, rnd2);
        double mn3 = Math.min(mn1, mn2);
        System.out.println("The minimal generated number was " + (int)mn3);	
	}
}
