package week02;

public class MuckJjiPa extends RockPaperScissors {

    @Override
    public boolean gameAct() {
        boolean atkDf = super.gameAct();
        boolean losewin = true;

        while (true) {
            if (atkDf) {
                System.out.println("\n[공격을 준비하세요]");
                
                String user = userSelect();
                String computer = computerSelect();

                System.out.println("\n유저[공격] : " + user);
                System.out.println("컴퓨터[방어] : " + computer);

                int a = muckJjiPaAct(user, computer);

                if (a == 1) {
                    break;
                }
                else if (a == 2) {
                    System.out.println("\n[공수 교대]");
                    atkDf = false;
                }
            }
            else {
                System.out.println("\n[방어를 준비하세요]");
                
                String user = userSelect();
                String computer = computerSelect();

                System.out.println("\n유저[방어] : " + user);
                System.out.println("컴퓨터[공격] : " + computer);

                int a = muckJjiPaAct(computer, user);

                if (a == 1) {
                    losewin = false;
                    break;
                }
                else if (a == 2) {
                    System.out.println("\n[공수 교대]");
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
            case "가위":
                if (df.equals("바위"))
                    change = true;
                break;
            case "바위":
                if (df.equals("보"))
                    change = true;
                break;
            case "보":
                if (df.equals("가위"))
                    change = true;
                break;
        }

        return change;
    }
}