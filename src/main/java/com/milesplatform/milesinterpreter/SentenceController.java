package com.milesplatform.milesinterpreter;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentenceController {
	
	@RequestMapping(path = "/sentence", method = RequestMethod.POST)
	public Sentence sentence(@RequestBody com.milesplatform.milesinterpreter.Sentence sentence) {		
//		Sentence parsed = new Sentence(data.getSentence());
//		System.out.println(parsed.getSentence());
//		System.out.println(parsed.getKeyphrases());
		return sentence;
	}
}
