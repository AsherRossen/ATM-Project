import java.util.ArrayList;

public class atm {
//	private double money;
//	private boolean open;
//	private int num;
	private ArrayList <account> a;
	
	public atm () {
	}
	
	public void openAccount (Integer i) {
		if (!numExists((int)i)) {
			account acc = new account ((int)i, 0);
			a.add(acc);
		}
	}
	
	public void openAccount (Integer i, double k) {
		if (!numExists((int)i)) {
			account acc = new account ((int)i, k);
			a.add(acc);
		}
		
	}
	
	private boolean numExists(int k) {
		for (int i = 0; i<a.size(); i++) {
			if (a.get(i).getNum()==k) {
				return true;
			}
		}
		return false;
		
	}
	
	private account numToAccount (int k) {
		for (int i = 0; i<a.size(); i++) {
			if (a.get(i).getNum()==k) {
				return a.get(i);
			}
		}
		return null;
	}
	
	public void closeAccount (Integer i) {
		if (!numExists((int)i)) {
			System.out.println("account does not exist");
			
		}
		else {
			account acc = numToAccount((int)i);
			a.remove(acc);
		}
	}
	
	public double checkBalance (Integer i) {
		if (!numExists((int)i)) {
			return 0.0;
			
		}
		else {
			account acc = numToAccount((int)i);
			return acc.getMoney();
		}
	}
	
	public boolean depositMoney(Integer i, double j) {
		if (!numExists((int)i)) {
			return false;
		}
		else {
			account acc = numToAccount((int)i);
			acc.dep(j);
			return true;
		}
	}
}
