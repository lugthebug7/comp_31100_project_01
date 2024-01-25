package project_01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> testLink = new LinkedList<>();
        Map<Integer, Long> linkMap = Inserter.timingTest(testLink, 20000);

        ArrayList<Integer> testArray = new ArrayList<>();
        Map<Integer, Long> arrayMap = Inserter.timingTest(testArray, 20000);

        System.out.println("LinkedList: " + linkMap);
        System.out.println("ArrayList: " + arrayMap);

    }
}
