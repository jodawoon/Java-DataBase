package homeworkWeek02;

import java.util.*;

public class UpgradeCalculator extends Calculator {
	public double cal(StringBuffer formula){
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < formula.length(); i++) {
            if (formula.charAt(i) == '(' || formula.charAt(i) == ')') {
                array.add(i);
            }
        }


        if (!array.isEmpty()) {
            ArrayList<Double> saveA = new ArrayList<>();

            for (int i = 0; i < array.size(); i+=2) {
                StringBuffer s = new StringBuffer(formula.substring(array.get(i)+1, array.get(i+1)));
                double a = cal(s);
                saveA.add(a);
            }

            for (int i = 0; i < saveA.size(); i++) {
                formula.replace(formula.indexOf("("), formula.indexOf(")")+1, Double.toString(saveA.get(i)));
            }
        }

        return calculatedValue(formula.toString(), returnOperator(formula.toString()));
    }
}