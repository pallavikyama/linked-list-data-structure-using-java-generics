package com.blz.datastructures;

public interface NodeInterface<E> {
	E getData();

	void setData(E data);

	NodeInterface<E> getNext();

	void setNext(NodeInterface<E> next);
}

class MyNode<E> implements NodeInterface<E> {
	private E data;
	private NodeInterface<E> next;

	public MyNode(E data) {
		this.data = data;
		this.next = null;
	}

	@Override
	public E getData() {
		return data;
	}

	@Override
	public void setData(E data) {
		this.data = data;
	}

	@Override
	public NodeInterface<E> getNext() {
		return next;
	}

	@Override
	public void setNext(NodeInterface<E> next) {
		this.next = next;
	}
}