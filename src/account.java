
public class account {
	private double money;
	private boolean open;
	private int num;
	
	public account (int i, double j) {
		num=i;
		money=j;
	}
	
	public account () {
		num=0;
		money=0;
	}
	
	public void setOpen(boolean k) {
		open = k;
	}
	
	public int getNum() {
		return num;
	}
	
	public double getMoney()
	{
		int m = (int)(money*100);
		money = (double)m/100.0;
		return money;
	}
	
	public void dep(double d) {
		int m = (int)(money*100);
		money = (double)m/100.0;
		money+=d;
	}
	
	public void with(double d) {
		int m = (int)(money*100);
		money = (double)m/100.0;
		money-=d;
	}
}
