package ch01;

import java.util.Optional;

class SimpleTree < E extends Comparable<E>>
{
	public E getElementValue() {
		return elementValue;
	}


	public void setElementValue(E elementValue) {
		this.elementValue = elementValue;
	}


	public SimpleTree<E> getLeft() {
		return left;
	}


	public void setLeft(SimpleTree<E> left) {
		this.left = left;
	}


	public SimpleTree<E> getRight() {
		return right;
	}


	public void setRight(SimpleTree<E> right) {
		this.right = right;
	}


	private E elementValue;
	
	private SimpleTree<E> left;
	private SimpleTree<E> right;
	
	
	public SimpleTree(E elementValue, SimpleTree<E> left, SimpleTree<E> right) {
		this.elementValue =elementValue;
		this.left = left;
		this.right = right;
		
		
	}


	void addNode(final E newElement)
	{
		if( newElement==null)
		{
			return;
		}
		
		
		if(newElement.compareTo(elementValue) <0)
		{
			if(this.left == null)
			{
				this.left = new SimpleTree<>(newElement,null, null);
				
			}else
			{
				this.left.addNode(newElement);
			}
			
		}else
		{
			if(this.right == null)
			{
				this.right = new SimpleTree<>(newElement,null, null);
				
			}else
			{
				this.right.addNode(newElement);
			}
			
		}
	}


	public boolean search(E searchValue) {
		if(searchValue==null)
		{
			return false;
		}
		
		if(searchValue.compareTo(elementValue) ==0)
		{
			return true;
		}else  if(searchValue.compareTo(elementValue) <0 )
		{
			if(this.left ==null)
			{
				return false;
			}else {
				return this.left.search(searchValue);
			}
		}else {
			if(this.right ==null)
			{
				return false;
			}else
			{
				return this.right.search(searchValue);
			}
		}
		
		
	}





}


public class TreeExample {

	public static void main(String[] args) {
	
		createTree();
		
	 int [] data = {8,19, 23, 2, 4, 5, 17,3 ,1,20};
		
	 createTree(data);
		

	}

	
	private static void createTree(int[] data) {
		
		if(data== null || data.length ==0)
		{
			return ;
		}

		final SimpleTree<Integer> root = new SimpleTree<>(data[0], null, null);
		
		for(int x : data)
		{
			root.addNode(x);
		}
		 
	}


	public static void createTree() {
		final SimpleTree<Integer> root = new SimpleTree<>(7, null, null);
		root.addNode(3);
		root.addNode(9);
		root.addNode(10);
		
		System.out.println(root.getRight().getRight().getElementValue());
		}
	
}
