package com.blz.datastructures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void TestUC01() {
		System.out.println("\nUC-01:");
		MyLinkedList<Integer> myList = new MyLinkedList<>();
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		myList.head = firstNode;
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		myList.tail = thirdNode;
		System.out.println("Created a simple Linked-list.");
		myList.printNodes();
		assertEquals(firstNode.getNext(), secondNode);
		assertEquals(secondNode.getNext(), thirdNode);
	}

	@Test
	public void TestUC02() {
		System.out.println("\nUC-02:");
		MyLinkedList<Integer> myList = new MyLinkedList<>();
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		myList.add(firstNode);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		myList.add(secondNode);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		myList.add(thirdNode);
		System.out.println("Created a simple Linked-list using add method.");
		myList.printNodes();
		assertEquals(myList.head, thirdNode);
		assertEquals(myList.head.getNext(), secondNode);
		assertEquals(myList.tail, firstNode);
	}

	@Test
	public void TestUC03() {
		System.out.println("\nUC-03:");
		MyLinkedList<Integer> myList = new MyLinkedList<>();
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		myList.add(firstNode);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		myList.append(secondNode);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);
		myList.append(thirdNode);
		System.out.println("Created a simple Linked-list using append method.");
		myList.printNodes();
		assertEquals(myList.head, firstNode);
		assertEquals(myList.head.getNext(), secondNode);
		assertEquals(myList.tail, thirdNode);
	}

	@Test
	public void TestUC04() {
		System.out.println("\nUC-04:");
		MyLinkedList<Integer> myList = new MyLinkedList<>();
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		myList.add(firstNode);
		MyNode<Integer> secondNode = new MyNode<Integer>(70);
		myList.append(secondNode);
		MyNode<Integer> thirdNode = new MyNode<Integer>(30);
		myList.insert(firstNode, thirdNode);
		System.out.println("Created a simple Linked-list using insert method.");
		myList.printNodes();
		assertEquals(myList.head, firstNode);
		assertEquals(myList.tail, secondNode);
		assertEquals(myList.head.getNext(), thirdNode);
	}

	@Test
	public void TestUC05() {
		System.out.println("\nUC-05:");
		MyLinkedList<Integer> myList = new MyLinkedList<>();
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		myList.add(firstNode);
		MyNode<Integer> secondNode = new MyNode<Integer>(70);
		myList.append(secondNode);
		MyNode<Integer> thirdNode = new MyNode<Integer>(30);
		myList.insert(firstNode, thirdNode);
		System.out.println("Removing " + myList.pop().getData() + ".");
		myList.printNodes();
		assertEquals(myList.head, thirdNode);
		assertEquals(myList.tail, secondNode);
		assertEquals(myList.head.getNext(), secondNode);
	}

	@Test
	public void TestUC06() {
		System.out.println("\nUC-06:");
		MyLinkedList<Integer> myList = new MyLinkedList<>();
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		myList.add(firstNode);
		MyNode<Integer> secondNode = new MyNode<Integer>(70);
		myList.append(secondNode);
		MyNode<Integer> thirdNode = new MyNode<Integer>(30);
		myList.insert(firstNode, thirdNode);
		System.out.println("Removing " + myList.popLast().getData() + ".");
		myList.printNodes();
		assertEquals(myList.head, firstNode);
		assertEquals(myList.tail, thirdNode);
		assertEquals(myList.head.getNext(), thirdNode);
	}

	@Test
	public void TestUC07() {
		System.out.println("\nUC-07:");
		MyLinkedList<Integer> myList = new MyLinkedList<>();
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		myList.add(firstNode);
		MyNode<Integer> secondNode = new MyNode<Integer>(70);
		myList.append(secondNode);
		MyNode<Integer> thirdNode = new MyNode<Integer>(30);
		myList.insert(firstNode, thirdNode);
		System.out.println("Found the data. Search successful!");
		myList.printNodes();
		assertEquals(myList.head, firstNode);
		assertEquals(myList.tail, secondNode);
		assertEquals(myList.head.getNext(), thirdNode);
		assertTrue(myList.search(30).getData().equals(30));
	}

	@Test
	public void TestUC08() {
		System.out.println("\nUC-08:");
		MyLinkedList<Integer> myList = new MyLinkedList<>();
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		myList.add(firstNode);
		MyNode<Integer> secondNode = new MyNode<Integer>(70);
		myList.append(secondNode);
		MyNode<Integer> thirdNode = new MyNode<Integer>(30);
		myList.insert(firstNode, thirdNode);
		MyNode<Integer> fourthNode = new MyNode<Integer>(40);
		myList.insert(myList.search(30), fourthNode);
		System.out.println("Added a new node into the Linked-list using insert and search methods.");
		myList.printNodes();
		assertEquals(myList.head, firstNode);
		assertEquals(myList.tail, secondNode);
		assertEquals(myList.search(30).getNext(), fourthNode);
	}

	@Test
	public void TestUC09() {
		System.out.println("\nUC-09:");
		MyLinkedList<Integer> myList = new MyLinkedList<>();
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		myList.add(firstNode);
		MyNode<Integer> secondNode = new MyNode<Integer>(70);
		myList.append(secondNode);
		MyNode<Integer> thirdNode = new MyNode<Integer>(30);
		myList.insert(firstNode, thirdNode);
		MyNode<Integer> fourthNode = new MyNode<Integer>(40);
		myList.insert(myList.search(30), fourthNode);
		myList.delete(40);
		System.out.println("Removing " + fourthNode.getData() + ".");
		myList.printNodes();
		assertEquals(myList.head, firstNode);
		assertEquals(myList.tail, secondNode);
		assertEquals(myList.head.getNext(), thirdNode);
		assertEquals(thirdNode.getNext(), myList.tail);
		assertEquals(3, myList.size());
	}

	@Test
	public void TestUC10() {
		System.out.println("\nUC-10:");
		SortedLinkedList<Integer> mySortedList = new SortedLinkedList<Integer>();
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		mySortedList.add(firstNode);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		mySortedList.add(secondNode);
		MyNode<Integer> thirdNode = new MyNode<Integer>(40);
		mySortedList.add(thirdNode);
		MyNode<Integer> fourthNode = new MyNode<Integer>(70);
		mySortedList.add(fourthNode);
		System.out.println("Created a sorted/ordered Linked-list using insert method.");
		mySortedList.printNodes();
		assertEquals(mySortedList.head, secondNode);
		assertEquals(mySortedList.tail, fourthNode);
		assertEquals(mySortedList.head.getNext(), thirdNode);
		assertEquals(thirdNode.getNext(), firstNode);
		assertEquals(firstNode.getNext(), mySortedList.tail);
	}
}
