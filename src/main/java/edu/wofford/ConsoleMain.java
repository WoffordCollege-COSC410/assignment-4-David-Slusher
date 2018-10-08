package edu.wofford;

import java.util.Scanner;

public class ConsoleMain {
	public static void main(String[] args) {
		TicTacToeModel model = new TicTacToeModel();
		Scanner keyboard = new Scanner(System.in);
		while(model.getResult() == TicTacToeModel.Result.NONE){
			model.setMarkAt(keyboard.nextInt(), keyboard.nextInt());
			System.out.println(model.toString());
		}
		if(model.getResult() == TicTacToeModel.Result.XWIN){
			System.out.println("X wins");
		}
		else if(model.getResult() == TicTacToeModel.Result.OWIN){
			System.out.println("O wins");
		}
		else{
			System.out.println("Tie");
		}
	}
}
