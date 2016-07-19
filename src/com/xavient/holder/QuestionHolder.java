package com.xavient.holder;
import java.util.ArrayList;
import java.util.HashMap;

import com.xavient.pojo.QuestionAnswer;


public class QuestionHolder {
	
	// Integer 1 - for B , 2 FOr M , 3 ,E

	static HashMap<Integer, ArrayList<QuestionAnswer>> questionHolder = new HashMap<Integer, ArrayList<QuestionAnswer>>() ;

	public static HashMap<Integer, ArrayList<QuestionAnswer>> getQuestionHolder() {
		return questionHolder;
	}
}
