package com.sortingalgorithms.mergesort;
public class ExamCell {

    public static void main(String[] args) {

        // Pre-sorted center-wise student data
        Student[] center1 = {
            new Student(101, 95),
            new Student(102, 90),
            new Student(103, 85)
        };

        Student[] center2 = {
            new Student(201, 92),
            new Student(202, 88),
            new Student(203, 80)
        };

        Student[] center3 = {
            new Student(301, 98),
            new Student(302, 91),
            new Student(303, 86)
        };

        // Merge all centers
        Student[] allStudents = new Student[
                center1.length + center2.length + center3.length];

        int index = 0;
        for (Student s : center1) allStudents[index++] = s;
        for (Student s : center2) allStudents[index++] = s;
        for (Student s : center3) allStudents[index++] = s;

        // Sort using Merge Sort
        MergeSorter.mergeSort(allStudents, 0, allStudents.length - 1);

        // Print Rank List
        System.out.println("📊 State-Level Rank List");
        for (int i = 0; i < allStudents.length; i++) {
            System.out.println(
                "Rank " + (i + 1) +
                " → Student ID: " + allStudents[i].id +
                ", Score: " + allStudents[i].score
            );
        }
    }
}
