import java.util.Scanner;

public class ForLoops
	{

		public static void main(String[] args)
			{
				showGeniusOne();
				System.out.println();
				showGeniusTwo();
				System.out.println();
				showGeniusThree();
				System.out.println();
				System.out.println();
				showGeniusFour();
				System.out.println();
				showGeniusFive();
				System.out.println();
				showGeniusSix();
				System.out.println();
				showGeniusSeven();
				System.out.println();
				showGeniusEight();
			}
		public static void showGeniusOne(){
			for (int i = 1; i<6; i++){
				System.out.println(i);
			}
		}
		public static void showGeniusTwo(){
			for (int i = 2; i<11; i=i+2){
				System.out.println(i + ") I Love Mullen");
			}
		}
		public static void showGeniusThree(){
			for (int i = 1; i<6; i++){
				System.out.print(i);
			}
		}
		public static void showGeniusFour(){
			for (int i = 10; i>0; i--){
				System.out.println(i);
			}
			System.out.println("LIFTOFF!");
		}
		public static void showGeniusFive(){
			int counter =0;
			for (int i = 5; i < 101; i=i+5){
				counter = counter + i;
			}
			System.out.println(counter);
		}
		public static void showGeniusSix(){
			Scanner userInput = new Scanner(System.in);
			System.out.println("Pick a lower bound");
			int lowerBound = userInput.nextInt();
			System.out.println("Pick an upper bound");
			int upperBound = userInput.nextInt();
			int counter = 0;
			for (;lowerBound <= upperBound; lowerBound++){
				counter = counter + lowerBound;
			}
			System.out.println(counter);
		}
		public static void showGeniusSeven(){
			Scanner userInput = new Scanner(System.in);
			System.out.println("Pick a lower bound");
			int lowerBound = userInput.nextInt();
			System.out.println("Pick an upper bound");
			int upperBound = userInput.nextInt();
			int counter = 0;
			for (;lowerBound <= upperBound; lowerBound++){
				if (lowerBound % 3 == 0){
				counter = counter + lowerBound;
				}
				else{}
			}
			System.out.println(counter);
		}
		public static void showGeniusEight(){
			System.out.println("*********");
			for (int i = 0; i < 7; i++){
				System.out.println("*       *");
			}
			System.out.println("*********");
		}

	}
