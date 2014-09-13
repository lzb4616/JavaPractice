/**
 * 
 */
package com.javaSort.practice;


/**
 *2014-9-13
 * @author zibin
 *查找算法
 */
public class Search {

	public static void main(String[] args) {
		int[] s = {1,2,3,69,8,7,9,4,1};
		int a = binarySearch(s, 1);
		System.out.println(""+a);
		
		
		int i; // 循环计数变量
	    BNTreeArray BNTree = new BNTreeArray(); // 声明二叉树数组

	    BNTree.TreeData[0] = s[0];

	    for (i = 1; i < s.length; i++)
	      BNTree.Create(s[i]); // 建立二叉查找树

	    int KeyValue = 1;
	    // 调用二叉查找法
	    if (BNTree.BinarySearch(KeyValue) > 0)
	      // 输出查找次数
	      System.out.println("Search Time = " + BNTree.BinarySearch(KeyValue));
	    else
	      // 输出没有找到数据
	      System.out.println("No Found!!");
	}
	
/**
 * 二分查找
 * 
 * @param args 查找的数组
 * @param key 查找的数值
 * @return 找到的位置
 * 
 * */
	public static  int binarySearch(int[] args,int key){
		int low = 0;
		int high = args.length - 1;		
		while(low<=high){
			int mid = (low+high)>>>1;
			if (args[mid] < key) {
				low = mid+1;
			}else if(args[mid] > key){
				high = mid - 1;
			}else {
				return mid;
			}			
		}
		return -(low+1);
	}
}

/**
 * 二叉查找树
 * */
class BNTreeArray {
	  public static int MaxSize = 20;
	  public static int[] TreeData = new int[MaxSize];
	  public static int[] RightNode = new int[MaxSize];
	  public static int[] LeftNode = new int[MaxSize];

	  public BNTreeArray() {
	    int i; // 循环计数变量

	    for (i = 0; i < MaxSize; i++) {
	      TreeData[i] = 0;
	      RightNode[i] = -1;
	      LeftNode[i] = -1;
	    }
	  }

	  // ----------------------------------------------------
	  // 建立二叉树
	  // ----------------------------------------------------
	  public void Create(int Data) {
	    int i; // 循环计数变量
	    int Level = 0; // 树的阶层数
	    int Position = 0;

	    for (i = 0; TreeData[i] != 0; i++)
	      ;

	    TreeData[i] = Data;
	    while (true) // 寻找节点位置
	    {
	      // 判断是左子树或是右子树
	      if (Data > TreeData[Level]) {
	        // 右树是否有下一阶层
	        if (RightNode[Level] != -1)
	          Level = RightNode[Level];
	        else {
	          Position = -1; // 设定为右树
	          break;
	        }
	      } else {
	        // 左树是否有下一阶层
	        if (LeftNode[Level] != -1)
	          Level = LeftNode[Level];
	        else {
	          Position = 1; // 设定为左树
	          break;
	        }
	      }
	    }

	    if (Position == 1) // 建立节点的左右连结
	      LeftNode[Level] = i; // 连结左子树
	    else
	      RightNode[Level] = i; // 连结右子树
	  }

	  // ---------------------------------------------------------
	  // 二叉查找法
	  // ---------------------------------------------------------
	  public static int BinarySearch(int KeyValue) {
	    int Pointer; // 现在的节点位置
	    int Counter; // 查找次数

	    Pointer = 0;
	    Counter = 0;
	    while (Pointer != -1) {
	      Counter++;
	      // 找到了欲寻找之节点
	      if (TreeData[Pointer] == KeyValue)
	        return Counter; // 传回查找次数
	      else if (TreeData[Pointer] > KeyValue)
	        Pointer = LeftNode[Pointer]; // 往左子树找
	      else
	        Pointer = RightNode[Pointer];// 往右子树找
	    }
	    return 0; // 该节点不在此二叉树中
	  }
	}