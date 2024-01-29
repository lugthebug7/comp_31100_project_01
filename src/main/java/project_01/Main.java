package project_01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> testLink = new LinkedList<>();
        //ask user for maxN and interval
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter max value of items to be reached by the LinkedList: ");
        int maxNLink = scanner.nextInt();
        System.out.print("Enter positive interal to reach the max value: ");
        int intervalLink = scanner.nextInt();
        Map<Integer, Long> linkMap = Inserter.timingTest(testLink, maxNLink, intervalLink);


        ArrayList<Integer> testArray = new ArrayList<>();
        System.out.print("Enter max value of items to be reached by the ArrayList: ");
        int maxNArray = scanner.nextInt();
        System.out.print("Enter positive interal to reach the max value: ");
        int intervalArray = scanner.nextInt();
        Map<Integer, Long> arrayMap = Inserter.timingTest(testArray, maxNArray, intervalArray);
        scanner.close();

        System.out.println("LinkedList: " + linkMap);
        System.out.println("ArrayList: " + arrayMap);

    }
}

