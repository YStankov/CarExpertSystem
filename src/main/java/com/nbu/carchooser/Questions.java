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
			
			questions[0] = new Question("����:", "�����", "������", "�����", "������", "����", "�����");
			
			questions[1] = new Question("��� ��������:", 
					"������", "�����", "������������", "������");
			
			questions[2] = new Question("��������� �����:", "�����", "�����������", "���������������");
			
			questions[3] = new Question("���� �����:", "2/3", "4/5");
			
			questions[4] = new Question("������ �� ������������:", "����� 2000", "2000 - 2012", "���� 2012");
			
			questions[5] = new Question("������� (� �.�.):", "�� 100", "101 - 150", "151 - 250", "��� 250");
			
			questions[6] = new Question("����������:", "������", "�����", "4X4");
			
			questions[7] = new Question("���� (� ��):", "��� 5000", "5000-10000", "10001 - 50000", "��� 50000");
		}
	}
}