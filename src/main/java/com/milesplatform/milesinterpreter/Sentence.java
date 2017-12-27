package com.milesplatform.milesinterpreter;

import java.util.List;
import edu.stanford.nlp.simple.Document;

public class Sentence {
	private String sentence;
	private List<String> keyphrases;
	
	public Sentence() {
		this.sentence = "";
		this.keyphrases = null;
	}
	
	public Sentence(String sentence) {
		this.sentence = sentence;
		parseSentence(this.sentence);
	}
	
	public void setSentence(String sentence) {
		this.sentence = sentence;
		parseSentence(sentence);
	}
	
	public String getSentence() {
		return this.sentence;
	}
	
	public List<String> getKeyphrases() {
		return this.keyphrases;
	}
	
	private void parseSentence(String sentence) {
		Document doc = new Document(sentence);
		this.keyphrases = doc.sentences().get(0).algorithms().keyphrases();
	}
}
