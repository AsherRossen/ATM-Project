
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
		return money;
	}
	
	public void dep(double d) {
		money+=d;
	}
	
	public void with(double d) {
		money-=d;
	}
}
