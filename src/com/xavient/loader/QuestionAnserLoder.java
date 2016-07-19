package com.xavient.loader;
import java.util.ArrayList;

import com.xavient.holder.QuestionHolder;
import com.xavient.pojo.QuestionAnswer;


public class QuestionAnserLoder {
	
	
	public static boolean load() {
		boolean result = false ;
			
		// B
		ArrayList<QuestionAnswer> questionAnswers = new ArrayList<QuestionAnswer>();
		
		ArrayList<String> optionList = new ArrayList<String>() ;
		optionList.add("Just In Time" );
		optionList.add("Just In Time1" );
		optionList.add("Just In Time2" );
		optionList.add("Just In Time3" );
		
		QuestionAnswer questionAnswer = new QuestionAnswer("What is the fulform of JIT ?",1,optionList);
	
		questionAnswers.add(questionAnswer);
		
		
		
		
		
		
		QuestionHolder.getQuestionHolder().put(1, questionAnswers);
		
		if(!QuestionHolder.getQuestionHolder().isEmpty()){
		result = true ;
		}
		return result ;
	}

}
