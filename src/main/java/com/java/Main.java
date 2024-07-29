package com.java;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		boolean playAgain;

		do {
			System.out.println("Zagrajmy w kamień papier i nożyce!");
			System.out.println("Wpisz odpowiednią cyfrę aby wybrać:");
			System.out.println("0 - Kamień");
			System.out.println("1 - Papier");
			System.out.println("2 - Nożyce");

			int userChoiceInt = sc.nextInt();
			String userChoice = Game.getChoiceName(userChoiceInt);

			int computerChoiceInt = ran.nextInt(3);
			String computerChoice = Game.getChoiceName(computerChoiceInt);

			System.out.println("Twój wybór: " + userChoice);
			System.out.println("Wybór komputera: " + computerChoice);

			String result = Game.determineWinner(userChoiceInt, computerChoiceInt);
			System.out.println(result);

			System.out.println("Czy chcesz zagrać ponownie? (tak/nie)");
			playAgain = sc.next().equalsIgnoreCase("tak");

		} while (playAgain);

		sc.close();
	}
}
