package week01;
import java.util.Scanner;

public class ScheduleClass extends ScheduleSet{
	public ScheduleClass(int count) {
		super(count);
	}
	public String[] getString() {
		Scanner in = new Scanner(System.in);
		String[] a = new String[3];
		for (int i=0; i<a.length; i++) {
			a[i] = in.next();
		}
		return a;
	}
}