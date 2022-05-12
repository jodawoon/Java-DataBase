package week01;
import java.util.Scanner;

abstract public class ScheduleSet implements IScheduleSet{
	Scanner in = new Scanner(System.in);
	private int count;
	
	public ScheduleSet(int count) {
		this.count = count;
	}
	@Override
	public Schedule[] makeSchedule() {
		Schedule[] sc = new Schedule[count];
		for (int i=0; i<count; i++) {
			String[] a = getString();
			if (a[2].isEmpty())
				sc[i] = new Schedule(a[0], a[1]);
			else
				sc[i] = new Schedule(a[0], a[1], a[2]);
		}
		return sc;
	}
	@Override
	public void sreachSchedule(Schedule[] sc, String day) {
		boolean nullIt = true;
		for (int i=0; i<count; i++) {
			if (sc[i].getDay().equals(day))
				nullIt = false;
				System.out.println("\n���� : " + sc[i].getDay() + "\n������ : " 
		                + sc[i].getSchedule() + "\n��� : " + sc[i].getPlace() + "\n");
		}
		if(nullIt) {
			System.out.println("\n�ش� ���ڿ� �������� �������� �ʽ��ϴ�.\n");
		}
	}
	
	public abstract String[] getString();
}
