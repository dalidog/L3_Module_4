package threads;

public class threadCracker {
	BruteForceCracker a = new BruteForceCracker();
	BruteForceCracker b = new BruteForceCracker();
	BruteForceCracker c = new BruteForceCracker();
	
	new Thread(()->a.checkCode(0).start());
	new Thread(()->b.checkCode(1).start());
	new Thread(()->c.checkCode(2).start());
}}
