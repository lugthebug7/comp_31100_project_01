package project_01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> testLink = new LinkedList<>();
        //ask user for maxN and interval
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter max value of items to be reached by the LinkedList: ");
        int maxNLink = scanner.nextInt();
        System.out.print("Enter positive interal to reach the max value: ");
        int intervalLink = scanner.nextInt();
        Stack<TimingNode> linkStack = Inserter.timingTest(testLink, maxNLink, intervalLink);


        ArrayList<Integer> testArray = new ArrayList<>();
        System.out.print("Enter max value of items to be reached by the ArrayList: ");
        int maxNArray = scanner.nextInt();
        System.out.print("Enter positive interal to reach the max value: ");
        int intervalArray = scanner.nextInt();
        Stack<TimingNode> arrayStack = Inserter.timingTest(testArray, maxNArray, intervalArray);
        scanner.close();

        System.out.println("LinkedList: ");
        for (TimingNode linkNode : linkStack) {
            System.out.println(linkNode);
        }
        
        System.out.println("ArrayList: ");
        for (TimingNode arrayNode : arrayStack) {
            System.out.println(arrayNode);
        }

    }
}

