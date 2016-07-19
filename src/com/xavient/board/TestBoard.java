package com.xavient.board;

import java.util.ArrayList;
import java.util.Scanner;

import com.xavient.holder.ScannerHolder;
import com.xavient.pojo.QuestionAnswer;

public class TestBoard {

	public void exam(ArrayList<QuestionAnswer> questionAnswers) {
		System.out.println("If You Want to Quit any time please press Q");
		Scanner scanner = ScannerHolder.getScanner();
		String answer;
		int correctAnswer = 0;
		for (QuestionAnswer questionAnswer : questionAnswers) {

			System.out.println(questionAnswer.getQuestion());
			printOption(questionAnswer.getOptionList());
			answer = scanner.next();

			int tempAnswer = 0;
			if (answer != null && !answer.equalsIgnoreCase("q")) {
				try {
					tempAnswer = Integer.parseInt(answer);
					if (tempAnswer == questionAnswer.getAnswer()) {
						correctAnswer = correctAnswer + 1;
					}
				} catch (NumberFormatException numberFormatException) {

				}
			} else {
				break;
			}
		}

		// Print
		System.out.println(correctAnswer);
	}

	// Decorate
	void printOption(ArrayList<String> optionList) {
		StringBuffer options = new StringBuffer("");
		for (int i = 0; i < optionList.size(); i++) {
			if (optionList.get(i) != null
					&& optionList.get(i).trim().length() != 0) {
				options.append((i + 1) + ". " + optionList.get(i) + "\t");
			}
		}
		System.out.println(options);
	}
}
