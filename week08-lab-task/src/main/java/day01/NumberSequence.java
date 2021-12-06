package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberSequence {
    private List<Integer> numberList;

    public NumberSequence(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public NumberSequence(int amount, int minimum, int maximum) {
        this.numberList = generateRandoms(amount, minimum, maximum);
    }

    public List<Integer> closeToAverage(int value) {
        List<Integer> results = new ArrayList<>();
        double average = getAverage();
        for (int i : numberList) {
            if (Math.abs(i - average) <= (value + 0.0001)) {
                results.add(i);
            }
        }
        return results;
    }

    public List<Integer> getNumberList() {
        return numberList;
    }

    private List<Integer> generateRandoms(int amount, int minimum, int maximum) {
        List<Integer> numbers = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < amount; i++) {
            numbers.add(rnd.nextInt(minimum, maximum + 1));
        }
        return numbers;
    }

    private double getAverage() {
        return getSum() / (double)numberList.size();
    }

    private int getSum() {
        int amount = 0;
        for (int i : numberList) {
            amount += i;
        }
        return amount;
    }
}
