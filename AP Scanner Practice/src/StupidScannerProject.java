import java.util.Scanner;
public class StupidScannerProject
	{
	public static void main(String[] args)
		{
		int age;
		double birthday;
		String color;
		
		Scanner inputBlock = new Scanner (System.in);
		System.out.println("Please enter your favorite color.");
		color = inputBlock.nextLine();
		System.out.println("Really? Your favorite color is " + color + "?");
		if(color.equals("blue")||color.equals("Blue"))
			{
			System.out.println("I love the color blue!");
			}
		else if(color.equals("green")||color.equals("Green"))
			{
			System.out.println("I love the color green!");
			}
		else
			{
			System.out.println("That's an ugly color.");
			}
		System.out.println("Please enter your age in integers.");
		age = inputBlock.nextInt();
		System.out.println("You're " + age + " years old?");
		if(age < 18)
			{
			System.out.println("Ha ha ha! You're younger than me!");
			}
		else if(age > 18)
			{
			System.out.println("Ew. You're so old!");
			}
		else
			{
			System.out.println("Wow! We're the same age!");
			}
		System.out.println("Please enter your birthday and month in the following format: mm.dd");
		birthday = inputBlock.nextDouble();
		if(birthday < 2 && birthday >= 1)
			{
			System.out.println("You were born in January.");
			}
		else if(birthday < 3 && birthday >= 2)
			{
			System.out.println("You were born in February.");
			}
		else if(birthday < 4 && birthday >= 3)
			{
			System.out.println("You were born in March.");
			}
		else if(birthday < 5 && birthday >= 4)
			{
			System.out.println("You were born in April.");
			}
		else if(birthday < 6 && birthday >= 5)
			{
			System.out.println("You were born in May.");
			}
		else if(birthday < 7 && birthday >= 6)
			{
			System.out.println("You were born in June.");
			}
		else if(birthday < 8 && birthday >= 7)
			{
			System.out.println("You were born in July.");
			}
		else if(birthday < 9 && birthday >= 8)
			{
			System.out.println("You were born in August.");
			}
		else if(birthday < 10 && birthday >= 9)
			{
			System.out.println("You were born in September! You're my favorite!");
			}
		else if(birthday < 11 && birthday >= 10)
			{
			System.out.println("You were born in October.");
			}
		else if(birthday < 12 && birthday >= 11)
			{
			System.out.println("You were born in November.");
			}
		else if(birthday < 13 && birthday >= 12)
			{
			System.out.println("You were born in December.");
			}
		else
			{
			System.out.println("That wasn't a valid entry.");
			}
		}
	}