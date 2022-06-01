package homeworkWeek02;

import java.util.*;

public class Calculator implements ICalculator {

    @Override
    public String returnFormula() {
        Scanner scanner = new Scanner(System.in);

        return scanner.next();
    }

    @Override
    public int[] returnOperator(String formula) {
        ArrayList<Integer> array = new ArrayList<>(); 

        for (int i = 0; i < formula.length(); i++) {
            switch (formula.charAt(i)) {
                case '+':
                case '-':
                case '*':
                case '/':
                    array.add(i);
            }
        }

        int[] operatorIndex = new int[array.size()];

        for (int i = 0; i < array.size(); i++) {
            operatorIndex[i] = array.get(i);
        }

        return operatorIndex;
    }

    @Override
    public double calculatedValue(String formula, int[] operator) {
        String[] array = formula.split("\\+|\\-|\\*|\\/");
        ArrayList<Double> numArray = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            numArray.add(Double.parseDouble(array[i]));
        }

        ArrayList<Double> sumArray = new ArrayList<>();
        ArrayList<Integer> indexArray = new ArrayList<>();

        for (int i = 0; i < operator.length; i++) {
            if (formula.charAt(operator[i]) == '*') {
                sumArray.add(numArray.get(i) * numArray.get(i+1));
                indexArray.add(i);
            } 
            else if (formula.charAt(operator[i]) == '/') {
                sumArray.add(numArray.get(i) / numArray.get(i+1));
                indexArray.add(i);
            }
        }

        for (int i = 0; i < indexArray.size(); i++) {
            numArray.set(indexArray.get(i), sumArray.get(i));
            numArray.set(indexArray.get(i)+1, null);
        }

        numArray.removeAll(Collections.singletonList(null));
        int count = 1;
        double value =  numArray.get(0);

        for (int i = 0; i < operator.length; i++) {
            if (formula.charAt(operator[i]) == '+') {
                value += numArray.get(count);
                count ++;
            } 
            else if (formula.charAt(operator[i]) == '-') {
                value -= numArray.get(count);
                count ++;
            }
        }

        return value;
    }
}