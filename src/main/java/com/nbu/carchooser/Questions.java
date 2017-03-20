package com.nbu.carchooser;

public class Questions {
	
	public static class Question {
		public String text;
		public String[] answers;
		
		public Question(String t, String... a) {
			text = t;
			answers = a;
		}
	}
	
	public static class Init {
		public Question[] questions;
		
		public Init() {
			questions = new Question[16];
			
			questions[0] = new Question("Купе:", "седан", "хечбек", "комби", "кабрио", "джип", "пикап");
			
			questions[1] = new Question("Тип двигател:", 
					"бензин", "дизел", "електрически", "хибрид");
			
			questions[2] = new Question("Скоростна кутия:", "ръчна", "автоматична", "полуавтоматична");
			
			questions[3] = new Question("Брой врати:", "2/3", "4/5");
			
			questions[4] = new Question("Година на производство:", "преди 2000", "2000 - 2012", "след 2012");
			
			questions[5] = new Question("Мощност (в к.с.):", "до 100", "101 - 150", "151 - 250", "над 250");
			
			questions[6] = new Question("Задвижване:", "предно", "задно", "4X4");
			
			questions[7] = new Question("Цена (в лв):", "под 5000", "5000-10000", "10001 - 50000", "над 50000");
		}
	}
}