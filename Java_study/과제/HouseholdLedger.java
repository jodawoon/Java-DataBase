package Java_edu_page;
import java.util.Scanner;

abstract class Money {
	private int money;
	
	Money() {
		this.money = money;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	abstract void moneyManagement();
}

abstract class MoneyAdd extends Money {
	private int addMoney;
	
	public MoneyAdd(int money, int addMoney) {
		super(money);
		this.addMoney = addMoney;
	}

	@Override
	void moneyManagement() {
		setMoney(getMoney() + addMoney);
	}
}

abstract class MoneyUse extends Money {
	private int usingMoney;

	public MoneyUse(int money, int usingMoney) {
		super(money);
		this.usingMoney = usingMoney;
	}

	@Override
	void moneyManagement() {
		setMoney(getMoney() - usingMoney);
	}
}

public class HouseholdLedger {
	Scanner in = new Scanner(System.in);
	
	void functionMoney(Money money) {
		if(money instanceof MoneyAdd)
			money.moneyManagement();
		else if(money instanceof MoneyUse)
			money.moneyManagement();
	}
	
	boolean Decision() {
		boolean sub;
		System.out.println("실행: t , 종료: (아무키를 누르세요)");
		String menu = in.next();
		switch(menu) {
		case "t" :
			sub = true;
			break;
		default :
			System.out.println("종료");
			sub = false;
		}
		return sub;
	}
	
	public static void main(String[] args) {
		Money[] money = new Money[30];
	}
}