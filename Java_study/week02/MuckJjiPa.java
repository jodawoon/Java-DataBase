package week02;

public class MuckJjiPa extends RockPaperScissors {

    @Override
    public boolean gameAct() {
        boolean atkDf = super.gameAct();
        boolean losewin = true;

        while (true) {
            if (atkDf) {
                System.out.println("\n[������ �غ��ϼ���]");
                
                String user = userSelect();
                String computer = computerSelect();

                System.out.println("\n����[����] : " + user);
                System.out.println("��ǻ��[���] : " + computer);

                int a = muckJjiPaAct(user, computer);

                if (a == 1) {
                    break;
                }
                else if (a == 2) {
                    System.out.println("\n[���� ����]");
                    atkDf = false;
                }
            }
            else {
                System.out.println("\n[�� �غ��ϼ���]");
                
                String user = userSelect();
                String computer = computerSelect();

                System.out.println("\n����[���] : " + user);
                System.out.println("��ǻ��[����] : " + computer);

                int a = muckJjiPaAct(computer, user);

                if (a == 1) {
                    losewin = false;
                    break;
                }
                else if (a == 2) {
                    System.out.println("\n[���� ����]");
                    atkDf = true;
                }
            }
        }

        return losewin;
    }

    public int muckJjiPaAct(String atk, String df){
        int distinction = 0;

        if (atk.equals(df))
            distinction = 1;
        else if (isChange(atk, df)) {
            distinction = 2;
        }

        return distinction;
    }

    public boolean isChange(String atk, String df){
        boolean change = false;

        switch (atk) {
            case "����":
                if (df.equals("����"))
                    change = true;
                break;
            case "����":
                if (df.equals("��"))
                    change = true;
                break;
            case "��":
                if (df.equals("����"))
                    change = true;
                break;
        }

        return change;
    }
}