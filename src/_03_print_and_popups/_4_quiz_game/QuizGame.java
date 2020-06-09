package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				String answer = JOptionPane.showInputDialog("What is 72 plus 8 ");
				// 3.  Use an if statement to check if their answer is correct
				if(answer.equalsIgnoreCase("80")) {
				score++;	
				}
				else {
					score--;
				}
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		answer = JOptionPane.showInputDialog("What is 8 multipy 7");
		if(answer.equalsIgnoreCase("56")) {
			score++;
		}
		else {
			score--;
		}
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showMessageDialog(null, "Score" +score);
	}
}
