package Java_edu_page;
import java.util.Scanner;

abstract class Money {
	int money;
	
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

abstract class MonneyAdd extends Money {
	int addMoney;
	
	public MonneyAdd(int addMoney) {
		super();
		this.addMoney = addMoney;
	}

	@Override
	void moneyManagement() {
		setMoney(getMoney() + addMoney);
	}
}

abstract class MoneyUse extends Money {
	int usingMoney;

	public MoneyUse(int usingMoney) {
		super();
		this.usingMoney = usingMoney;
	}
	
}

public class HouseholdLedger {
	public static void main(String[] args) {
		
	}
}