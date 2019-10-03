/**
 * 
 */
import java.util.Scanner;
/**
 * @author heathjay
 * @date 2 Oct 2019 19:13:36
 * @version 1.0
 */
public class OperatorDemo {
	public static void main(String[] args) {
//		Scanner inner = new Scanner(System.in);
//		System.out.println("please input money:");
//		double money = inner.nextDouble();
//		
//		int hundred = (int)money / 10;
//		int five = (int)money % 10 / 5;
//		int one = (int)money % 10 - five * 5;
//		System.out.printf("handred: %d five: %d one : %d", hundred, five, one);
//		
		Scanner input = new Scanner(System.in);
		int choice = -1;
		
		System.out.println("1.login in");
		System.out.println("2.exit ");
		System.out.println("3. error");
		choice = input.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("good");
			break;
		case 2:
			System.exit(0);
			break;
		case 3:
			System.out.println("error");
			break;
		default:
			System.out.println("please change your input");
		}
		
		
	}
}
