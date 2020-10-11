package com.blz.datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void TestUC5() {
		MyLinkedList<Integer> myList = new MyLinkedList<>();
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		myList.add(firstNode);
		MyNode<Integer> secondNode = new MyNode<Integer>(70);
		myList.append(secondNode);
		MyNode<Integer> thirdNode = new MyNode<Integer>(30);
		myList.insert(1, thirdNode);
		System.out.println("Removing " + myList.pop() + ".");
		myList.printNodes();
		assertEquals(myList.head, thirdNode);
		assertEquals(myList.tail, secondNode);
		assertEquals(myList.head.getNext(), secondNode);
	}
}
