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
				System.out.println("\n일자 : " + sc[i].getDay() + "\n스케줄 : " 
		                + sc[i].getSchedule() + "\n장소 : " + sc[i].getPlace() + "\n");
		}
		if(nullIt) {
			System.out.println("\n해당 일자에 스케줄이 존재하지 않습니다.\n");
		}
	}
	
	public abstract String[] getString();
}
