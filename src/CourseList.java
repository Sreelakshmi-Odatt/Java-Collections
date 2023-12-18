/*
 * 
File: CourseList.java 
  Student Numebr :Sreelakshmi Odatt Venu
 Student Number:041093516
 Course: CST8284 – OOP
 Assignment: Assignment 3
 Due Date: December 3 2023
 Professor: Veda Vasavi Erukulla
 Purpose: This class display the courses and the list of course in the requierd list such as reversed , capitalised , etc.
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;
import java.util.LinkedHashSet;

/**
 * This CourseList.java is used to display the the list of course in the
 * requierd list such as reversed , capitalised , etc.
 * 
 * @author Sreelakshmi Odatt Venu
 * @version 1.0
 * @since 17.0.7
 * @see java.util.Arrays
 * @see java.util.LinkedList
 * @see java.util.Collections
 * @see java.util.LinkedHashSet
 * 
 */

public class CourseList {
	/**
	 * entry point the program
	 * 
	 * @param args the command line
	 */

	public static void main(String[] args) {
		/**
		 * First array named courses containing the courses math, english, chemistry,
		 * physics, history, geography
		 */
		String[] courses = { "math", "english", "chemistry", "physics", "history", "geography" };

		/**
		 * Second array named coruses2 containing the courses religion, arts,
		 * accounting, math, programming, biology .
		 */
		String[] courses2 = { "religion", "arts", "accounting", "math", "programming", "biology" };

		/**
		 * Creating a linked list named list1 of type String and adding the elements of
		 * courses to the list1 using asList
		 */
		LinkedList<String> list1 = new LinkedList<String>(Arrays.asList(courses));

		/**
		 * Creating a linked list named list2 of type String and adding the elements of
		 * courses2 to the list2 using asList
		 */

		LinkedList<String> list2 = new LinkedList<String>(Arrays.asList(courses2));

		/**
		 * Adding all the elements of the list2 to the list1 using the addAll method
		 * which is part of the collection interface.
		 */
		System.out.println("Welcome Everyone to My Assignment 3. My name is. Sreelakshmi Odatt Venu.");
		// output List contents

		/**
		 * Clearing the elements of the list2 list.
		 */
		System.out.printf("%nThe List is : %n");

		list1.addAll(list2);
		// obtain sublist and use clear method to delete sublist items

		/**
		 * releasing or clearing the elements of the list2 after adding to the list1
		 */
		list2.clear();
		/**
		 * printing the elements of the list1. using th eprint List method
		 */
		printList(list1);

		/**
		 * changing the letters of the content of the list to uppercase using the
		 * replaceAll method .
		 * 
		 */
		list1.replaceAll(String::toUpperCase);
		// locate String objects and convert to uppercase
		/***
		 * Displaying names of courses in uppercase letters and using the printList
		 */
		System.out.printf("%nDisplaying names of courses in uppercase letters...%n");
		System.out.printf("%nThe List is : %n");

		/**
		 * printing the elements of the list1. using the print List method
		 */
		printList(list1);
		/**
		 * Creating a sublist of items 4 to 6 from list1. Using that sublist and the
		 * appropriate method to delete the sublist from list1, and then print out the
		 * updated output
		 */
		LinkedList<String> newsublist = new LinkedList<>(list1.subList(4, 7));
		list1.removeAll(newsublist);

		System.out.printf("%nDeleting courses 4 to 6...%n");
		System.out.printf("%nThe List is : %n");
		/**
		 * printing the elements of the list1. using the print List method
		 */
		printList(list1);
		// print the list in reverse order

		System.out.printf("%nHere is the current list of courses...%n");
		System.out.printf("%nThe List is : %n");
		/**
		 * printing the elements of the list1. using the print List method
		 */
		printList(list1);
		/**
		 * using the collections class method , 'reverse', to reverse the content of the
		 * list1
		 */
		Collections.reverse(list1);
		System.out.printf("%nReversed List :%n");
		/**
		 * printing the elements of the list1 in reverse order. using the print List
		 * method
		 */
		printList(list1);

		/**
		 * sorting the list in alphabetical order by using the collections class method
		 * , sort and printing the result ..
		 */
		Collections.sort(list1);
		System.out.printf("%nSorted courses in alphabetical order...%n");
		System.out.printf("%nThe List is : %n");
		/**
		 * printing the elements of the list1. using the print List method
		 */
		printList(list1);
		System.out.printf("%nRemoving duplicate courses...%n");
//		// locate String objects and eliminate duplicates
		/**
		 * creating a hashset to remove the
		 */
		LinkedHashSet<String> set = new LinkedHashSet<>();
		list1.removeIf(element -> !set.add(element));
		System.out.printf("%nNon-duplicates are: ");
		printList(list1);

	}

	/**
	 * Creating a method named printList() and using it to print out the updated
	 * content of list1
	 * 
	 * @param list1 the updated list1 .
	 */
	private static void printList(LinkedList<String> list1) {
		// TODO Auto-generated method stub
		System.out.println(String.join(" , ", list1));

	}

}
