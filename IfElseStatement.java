import java.util.Scanner;
public class IfElseStatement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Any 2 Numbers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		if(num1 > num2)
		{
			System.out.println(num1+ "is big");
		}else {
			System.out.println(num2+ "is big");
		}
		input.close();
		

	}

}