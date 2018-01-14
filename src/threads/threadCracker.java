package threads;

import java.util.ArrayList;
import java.util.Arrays;

public class threadCracker {
	public static void main(String[] args) {
	BruteForceCracker a = new BruteForceCracker();
	ArrayList<Thread> threads = new ArrayList<Thread>();
	for (int i = 0; i < 999; i++) {
		int x = i;
		Thread thread = new Thread(()-> BruteForceCracker.checkCode(x));
		threads.add(thread);
	}
	for (int i = 0; i < 999; i++) {
		threads.get(i).start();
	}
	}
		
		
	
}
