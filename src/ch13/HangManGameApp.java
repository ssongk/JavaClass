package ch13;

import java.util.*;
import java.io.*;

//words.txt ������ �а� ���Ϳ� �����ϰ� ���ͷκ��� �����ϰ� �ܾ �����ϴ� Ŭ����
class Words {
	private Vector<String> wordVector = new Vector<String>();

	public Words(String fileName) {
		try {
			Scanner fScanner = new Scanner(new FileReader(fileName));
			while(fScanner.hasNext()) { // ���� ������ ����
				String word = fScanner.nextLine(); // �� ������ �а� '\n'�� ���� ������ ���ڿ��� ����
				wordVector.add(word); // ���ڿ��� ���Ϳ� ����
			}
			fScanner.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("file not found error");
			System.exit(0);
		}
	}	
	public String getRandomWord() {
		final int WORDMAX = wordVector.size(); // �� �ܾ��� ����
		int index = (int)(Math.random()*WORDMAX);
		return wordVector.get(index);
	}	
}
public class HangManGameApp {
	private static final int HIDDENCHAR = 2; // ����� ���� ����
	private StringBuffer hiddenWord; // ���� ���ڸ� ���� �ܾ�
	private String newWord; // ������ ���� ������ �ܾ�
	private Scanner scanner; // Ű �Է�
	private int failCount; // Ʋ�� Ƚ��
	
	public HangManGameApp() { 
		scanner = new Scanner(System.in);
	}

	// ������ �����ϴ� �޼ҵ�
	public void run() {
		System.out.println("���ݺ��� ��� ������ �����մϴ�.");
		Words words = new Words("words.txt"); // words.txt ������ ��� �ܾ �о� ���Ϳ� �����Ѵ�.		
		while(true) {
			newWord = words.getRandomWord(); // ������ �ܾ� ����
			if(newWord == null) break; // �ܾ� ���ÿ� ������ �ִ� ��� ���α׷� ����
			makeHidden(); // 2���� ���ڸ� ���� �ܾ� �����
			go(); // ���� ����
			System.out.print("Next(y/n)?");
			String answer = scanner.next();
			if(answer.equals("n")) // n�� �Է��ϸ� ����
				break;
		}
		System.out.println("��� ������ �����մϴ�...");
	}
	
	// ���õ� �ܾ� newWord�� 2 ���� ���ڸ� ���� �ܾ� hiddenWord�� �����.
	void makeHidden() {
		hiddenWord = new StringBuffer(newWord);
		Random r = new Random();
		
		for(int k=0; k<HIDDENCHAR; k++) {
			int index = r.nextInt(newWord.length());
			char c = newWord.charAt(index);
			for(int i=0; i<newWord.length(); i++) {
				if(hiddenWord.charAt(i) == c)
					hiddenWord.setCharAt(i,'-');
			}
		}
	}	
	// ����� Ű�� �Է¹����鼭 ��� ������ �����Ѵ�. 5 �� Ʋ���� �����Ѵ�.
	// �� �ܾ� ���� �� y/n ������ ���� n�� �Է��ϸ� �����Ѵ�.
	void go() {
		failCount=0;
		char key;
		do {
			if(failCount == 5) {
				System.out.println("5�� ���� �Ͽ����ϴ�.");
				break;
			}
			System.out.println(hiddenWord);
			System.out.print(">>");
			String text = scanner.next();
			key =  text.charAt(0);
		}while(!complete(key));
		System.out.println(newWord);
	}	
	// ����ڰ� �Է��� ���� key�� ���� ���ڿ� ��ġ�ϴ��� �˻��ϰ� ��ġ�ϸ� true�� �����Ѵ�.
	// �׸��� ���� hiddenWord�� '-'���ڸ� key ���ڷ� �����Ѵ�.
	boolean complete(char key) {
		boolean hit = false;
		for(int i=0; i<newWord.length(); i++) {
			if(hiddenWord.charAt(i) == '-' && newWord.charAt(i) == key) {
				hiddenWord.setCharAt(i, key);
				hit = true;
			}
		}
		if(!hit)
			failCount++;
		for(int i=0; i<newWord.length(); i++) {
			if(hiddenWord.charAt(i) == '-')
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		HangManGameApp app = new HangManGameApp();
		app.run();
	}
}

