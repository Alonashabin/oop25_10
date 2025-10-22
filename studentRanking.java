package oop25_10;

import java.util.*;

class Student {
    String name;
    String regNo;
    String course;
    int[] marks = new int[6];
    int totalMarks;
    int rank;

    public void calculateTotal() {
        totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
    }
}

public class studentRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("\nEnter details for Student " + (i + 1));
            System.out.print("Name: ");
            students[i].name = sc.nextLine();
            System.out.print("Register Number: ");
            students[i].regNo = sc.nextLine();
            System.out.print("Course: ");
            students[i].course = sc.nextLine();

            System.out.println("Enter marks for 6 subjects:");
            for (int j = 0; j < 6; j++) {
                students[i].marks[j] = sc.nextInt();
            }
            sc.nextLine();
            students[i].calculateTotal();
        }

        Arrays.sort(students, (a, b) -> b.totalMarks - a.totalMarks);

        int currentRank = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0 && students[i].totalMarks == students[i - 1].totalMarks) {
                students[i].rank = students[i - 1].rank;
            } else {
                students[i].rank = currentRank;
            }
            currentRank++;
        }

        System.out.println("\nRank List:");
        System.out.printf("%-5s %-15s %-10s %-10s %-10s\n", "Rank", "Name", "RegNo", "Course", "Total");
        for (Student s : students) {
            System.out.printf("%-5d %-15s %-10s %-10s %-10d\n", s.rank, s.name, s.regNo, s.course, s.totalMarks);
        }

        sc.close();
    }
}
