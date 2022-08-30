
public class atm {
//	private double money;
//	private boolean open;
//	private int num;
	private static int index;
	private account[] a;
	
	public atm () {
		index=0;
	}
	
	public void openAccount (Integer i) {
		if (!numExists((int)i)) {
			account acc = new account ((int)i, 0);
			a[index]=acc;
			index++;
		}
	}
	
	public void openAccount (Integer i, double k) {
		if (!numExists((int)i)) {
			account acc = new account ((int)i, k);
			a[index]=acc;
			index++;
		}
		
	}
	
	private boolean numExists(int k) {
		for (int i = 0; i<index; i++) {
			if (a[i].getNum()==k) {
				return true;
				break;
			}
		}
		return false;
		
	}
	
	public 
}
