package testapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestResult {
    private final List<TestItem> test;
    private final Map<Integer, Integer> answers = new HashMap<>();

    public TestResult(List<TestItem> test) {
        this.test = test;
    }

    public int getAnswer(int questionNumber) {
        return answers.get(questionNumber);
    }

    public boolean isAnswer(int questionNumber) {
        return answers.containsKey(questionNumber);
    }

    public boolean isValidAnswer(int questionNumber) {
        return answers.get(questionNumber) == test.get(questionNumber).getAnswerNumber();
    }

    public void put(int questionNumber, int answerNumber) {
        answers.put(questionNumber, answerNumber);
    }

    public int countOfValidAnswers() {
        int counter = 0;
        int index = 0;
        for (TestItem item : test) {
            if (isAnswer(index))
                if (isValidAnswer(index)) {
                    counter++;
                }
            index++;
        }
        return counter;
    }

    public int countOfInvalidAnswers() {
        int counter = 0;
        int index = 0;
        for (TestItem item : test) {
            if (isAnswer(index)) {
                if (!isValidAnswer(index)) {
                    counter++;
                }
                index++;
            }
        }
        return counter;
    }


    public int countOfEmptyAnswers(){
        return test.size() - countOfValidAnswers() - countOfInvalidAnswers();
    }

}