package com.xl.demo.domain;

public class Word {

	String word;
	Role role;
	
	public static enum Role {
		subject, verb, article, adjective, noun;
	}	
	
	public Word() {
		super();
	}
	
	public Word(String word){
		this.word = word;
	}	
	
	public Word(String word, Role role) {
		this.word = word;
		this.role = role;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return word;
	}
}
