package week01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("�������� ���� ���� ���ϼ��� : ");
        ScheduleClass sdc = new ScheduleClass(scan.nextInt());
        
        System.out.println("---������ ����---");
        Schedule[] schedule = sdc.makeSchedule();

        while(true){
            System.out.print("�������� �˻��� ��¥�� �Է��ϼ���(���� : q) : ");
            String day = scan.next();
            
            if(day.equals("q")){
                break;
            }
            
            sdc.sreachSchedule(schedule, day);
        }
    }
}