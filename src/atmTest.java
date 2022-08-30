
public class atmTest {

	public static void main(String[] args) {
		atm a = new atm();
		
		a.openAccount(123, 18.5);
		a.openAccount(1687);
		
		//System.out.println(a.checkBalance(123));
		
		System.out.println(a.depositMoney(1687, 368));
		System.out.println(a.checkBalance(1687));
		
		
		a.withdrawMoney(1687, 80);
		System.out.println(a.checkBalance(1687));
		
		a.withdrawMoney(1687, 300);
		System.out.println(a.checkBalance(1687));

	}

}
