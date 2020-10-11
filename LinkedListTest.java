package com.blz.datastructures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void TestUC7() {
		MyLinkedList<Integer> myList = new MyLinkedList<>();
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		myList.add(firstNode);
		MyNode<Integer> secondNode = new MyNode<Integer>(70);
		myList.append(secondNode);
		MyNode<Integer> thirdNode = new MyNode<Integer>(30);
		myList.insert(1, thirdNode);
		assertEquals(myList.head, firstNode);
		assertEquals(myList.tail, secondNode);
		assertEquals(myList.head.getNext(), thirdNode);
		assertTrue("Found the data. Search successful!", myList.search(30).getData().equals(30));
	}
}
