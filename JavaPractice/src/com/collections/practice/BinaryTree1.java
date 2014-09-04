package com.collections.practice;
/**
 * 2014-8-16
 * @author zibin
 * 
 * java构建二叉树
 * */
public class BinaryTree1 {
	public int value;
	public BinaryTree1 left;
	public BinaryTree1 right;
	
	public void store(int value)
	{
		if(value<this.value)
		{
			if(left == null)
			{
				left = new BinaryTree1();
				left.value=value;
			}
			else
			{
				left.store(value);
			}
		}
		else if(value>this.value)
		{
			if(right == null)
			{
				right = new BinaryTree1();
				right.value=value;
			}
			else
			{
				right.store(value);
			}			
		}
	}
	
	public boolean find(int value)
	{	
		System.out.println(value+":"+"happen " + this.value);
		if(value == this.value)
		{
			return true;
		}
		else if(value>this.value)
		{
			if(right == null) return false;
			return right.find(value);
		}else
		{
			if(left == null) return false;
			return left.find(value);
		}

	}
	
	public  void preList()
	{
		System.out.print(this.value + ",");
		if(left!=null) left.preList();
		if(right!=null) right.preList();
	}
	
	public void middleList()
	{
		if(left!=null) left.preList();
		System.out.print(this.value + ",");
		if(right!=null) right.preList();		
	}
	public void afterList()
	{
		if(left!=null) left.preList();
		if(right!=null) right.preList();
		System.out.print(this.value + ",");		
	}	
	public static void main(String [] args)
	{
		int [] data = new int[5];
		for(int i=0;i<data.length;i++)
		{
			data[i] = (int)(Math.random()*100) + 1;
			System.out.print(data[i] + ",");
		}
		System.out.println();
		
		BinaryTree1 root = new BinaryTree1();
		root.value = data[0];
		for(int i=1;i<data.length;i++)
		{
			root.store(data[i]);
		}
		
		root.find(data[3]);
		
		root.preList();
		System.out.println();
		root.middleList();
		System.out.println();		
		root.afterList();
	}
}
