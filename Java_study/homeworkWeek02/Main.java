package homeworkWeek02;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpgradeCalculator calculator = new UpgradeCalculator();

        System.out.print("����� ���� �Է� �ϼ��� : ");
        StringBuffer formula = new StringBuffer(calculator.returnFormula());

        System.out.println("�� : " + calculator.cal(formula));
	}

}
