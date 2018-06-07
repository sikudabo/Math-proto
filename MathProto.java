/* Fun math game that will allow users to answer 10 addition questions. */
import java.util.Scanner;
public class MathProto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Introduce the user to the game 
		System.out.println("Welcome to math addition");
		System.out.println("You will have a chance to answer 10 addition questions");
		int question_number;
		String play_again = "";
		double score;
		double grade = 0;
		Scanner scan = new Scanner(System.in);
		
		
		do {question_number = 0;
			score = 0;
			while(question_number < 10) {
				question_number += 1;
				int num1 = (int)(Math.random() * 10 + 1);
				int num2 = (int)(Math.random() * 10 + 1);
				System.out.println("Question " + question_number + ": " + num1 + "+" + num2);
				int answer = num1 + num2;
				int user_answer = scan.nextInt();
				if(user_answer == answer) {
					System.out.println("That answer is correct!");
					score += 1;
					System.out.println("You score is: " + score + "\n" );
				}
				else if (user_answer != answer) {
					System.out.println("That answer is not correct!");
				}
				}
				grade = score / 10;
				System.out.println("You final grade is: " + grade * 100 + "%");
				System.out.println("Do you want to play again?(Y/N)");
				play_again = scan.next();
			}while(play_again.equalsIgnoreCase("y"));
			
			
		}

	}


