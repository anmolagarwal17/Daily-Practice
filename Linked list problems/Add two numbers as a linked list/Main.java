/*
Problem statement:

You are given two linked-lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

Example:
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
*/

import java.util.*;

class Main
{
	public static void main(String[]args)
	{
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		list1.add(2);
		list1.add(4);
		list1.add(3);

		list2.add(5);
		list2.add(6);
		list2.add(4);

		// getting size of both linked lists
		int size1 = list1.size();
		int size2 = list2.size();
		
		// variables to store number that linked list contains
		int num1 = 0;
		int num2 = 0;


		// getting number, digit by digit and reversing it alongside to get original number
		// I could instead have used stack here(to reverse number) but it would probably be less efficient and unnecessary

		// for list1
		int i = 0;	// counter
        ListIterator list_Iter = list1.listIterator(0); 
		while(list_Iter.hasNext())
		{
			int temp = (int) Math.pow(10,i) * (int) list_Iter.next();
			num1 = num1 + temp;
			i++;
		}

		// for list2
		i = 0;	//resetting i's value for list2
		list_Iter = list2.listIterator(0); 
		while(list_Iter.hasNext())
		{
			int temp = (int) Math.pow(10,i) * (int) list_Iter.next();
			num2 = num2 + temp;
			i++;
		}
		
		int ans = num1 + num2;

		System.out.println(ans);
	}
}










