package week02;

import java.util.Random;
import java.util.Scanner;

public class FindApproximateValue implements IGameFrame{

    @Override
    public <T> T  computerSelect() {
        Random random = new Random();

        return (T) (Integer.valueOf(random.nextInt(99)+1));
    }

    @Override
    public <T> T  userSelect() {
        Scanner scanner = new Scanner(System.in);
        int num;

        while (true) {
            System.out.println("\n[���ڸ� �Է��ϼ��� (1 ~ 100)]\n");
            num = scanner.nextInt();

            if (num >= 1 && num <= 100) {
                break;
            }
            else {
                System.out.println("[1���� 100������ ���ڸ� ������ �ּ���]");
            }
        }

        return (T) Integer.valueOf(num);
    }

    @Override
    public boolean gameAct() {
        boolean losewin = true;
        Random random = new Random();

        while (true) {
            int user = Integer.parseInt(userSelect());
            int computer = Integer.parseInt(computerSelect());

            int value = random.nextInt(99) + 1;

            System.out.println("\n���õȼ� : " + value + "\n������ �����Ѽ� : " + user + "\n��ǻ�Ͱ� �����Ѽ� : " + computer);
            System.out.println("\n������ ���� : " + Math.abs(value - user) + "\n��ǻ���� ���� : " + Math.abs(value - computer));

            if(Math.abs(value - user) == Math.abs(value - computer)){
                System.out.println("\n[�����ϴ�]\n");
                continue;
            } else if (Math.abs(value - user) > Math.abs(value - computer)) {
                losewin = false;
            }

            break;
        }

        return losewin;
    }
    
}