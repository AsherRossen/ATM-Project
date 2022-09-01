import java.util.ArrayList;

public class ATM {
	private ArrayList <account> a;
	
	public ATM () {
		a=new ArrayList<account>();
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
		if (a.size()==0) {
			return false;
		}
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
		account acc = numToAccount((int)i);
		if (!numExists((int)i) || acc.getMoney()!=0) {
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
		account acc = numToAccount((int)i);
		if (!numExists((int)i)|| j<=0) {
			return false;
		}
		else {
			acc.dep(j);
			return true;
		}
	}
	
	public boolean withdrawMoney (Integer i, double j) {
		account acc = numToAccount((int)i);
		if (!numExists((int)i)|| j<=0||j>acc.getMoney()) {
			return false;
		}
		else {
			acc.with(j);
			return true;
		}
	}
}
