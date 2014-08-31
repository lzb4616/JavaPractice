/**
 * 
 */
package com.javaSort.practice;

import static java.lang.Math.*;
/**
 * 2014-8-31
 * 
 * @author zibin
 * 
 */
public class Sort {

	/*******************
	 * 冒泡排序 ************************
	 * 冒泡排序法的基本思想是：对待排序记录关键字从后往前（逆序）进行多遍扫描，当发现相邻两个关键字的次序与排序要求的规则不符时
	 * ，就将这两个记录进行交换。这样，关键字较小的记录将逐渐从后面向前面移动，就象气泡在水中向上浮一样，所以该算法也称为气泡排序法。
	 */
	public void bubbleSort(int[] a) {
		int i, j;
		for (i = 0; i < a.length; ++i) {
			for (j = a.length - 1; j > i; --j) {
				if (a[j] < a[j - 1]) {
					swap(a, j, j - 1);
				}
			}
		}
	}

	/****************
	 * 优化的冒泡排序 ********************
	 * 为了提升冒泡排序法的效率，可对BubbleSort函数进行改进，当在某一遍扫描时，发现数据都已经按顺序排列了，就不再进行后继的扫描，而结束排序过程
	 */
	public void betterBubbleSort(int[] a) {
		int i, j;
		boolean flag = true;
		for (i = 0; i < a.length && flag; ++i) {
			flag = false;
			for (j = a.length - 1; j > i; --j) {
				if (a[j] < a[j - 1]) {
					swap(a, j, j - 1);
					flag = true;
				}
			}
		}
	}

	/******************
	 * 选择排序 **************** 选择排序（Selection
	 * Sort）的基本思想：对n个记录进行扫描，选择最小的记录，将其输出，接着在剩下的n
	 * -1个记录中扫描，选择最小的记录将其输出，……不断重复这个过程，直到只剩一个记录为止。
	 */
	public void selectSort(int a[]) {
		int i, j;
		for (i = 0; i < a.length; i++)
			for (j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					swap(a, i, j);
				}
			}
	}

	/*******************
	 * 插入排序 ********************* 插入排序（Insertion
	 * Sort）的算法描述是一种简单直观的排序算法。它的工作原理是通过构建有序序列
	 * ，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。插入排序在实现上
	 * ，在从后向前扫描过程中，需要反复把已排序元素逐步向后移动，为最新元素提供插入空间
	 */
	public void insertSort(int[] a) {
		int i, j;
		int temp;
		for (i = 1; i < a.length; ++i) {// 0->length
			temp = a[i];
			for (j = i; j > 0 && temp < a[j - 1]; --j) {// 只有小于上一个数才进行比较交换
				a[j] = a[j - 1];
			}
			a[j] = temp;
		}
	}

	/**************
	 * 希尔排序,是插入排序的一种改进 ************** 希尔排序又称为缩小增量排序，也属于插入排序类的算法，是对直接插入排序的一种改进。
	 * 
	 * 基本思想就是：将需要排序的序列划分为若干个较小的序列，对这些序列进行直接插入排序，通过这样的操作可使用需要排序的数列基本有序，
	 * 最后再使用一次直接插入排序
	 * 。这样，首先对数量较小的序列进行直接插入排序可提高效率，最后对基本有序的序列进行直拦插入排序，也可提高效率，从而使整个排序过程的效率得到提升。
	 */
	public void shellSort(int[] a) {
		int i, j, temp;
		int increment = a.length;// 自己可以自由设定
		do {
			/* 设置步长，這是自由设计的，可以设计为increment=increment /5等等 */
			increment = increment / 3 + 1;
			for (i = increment; i < a.length; ++i) {
				/* 进行插入排序 */
				temp = a[i];
				for (j = i; j >= increment && a[j - increment] > temp; j -= increment) {
					a[j] = a[j - increment];
				}
				a[j] = temp;
			}
		} while (increment > 1);
	}

	/*************
	 * 堆排序，有选择排序的性质 ***********
	 * 堆是一个完全二叉树，树中每个结点对应于原始数据的一个记录，并且每个结点应满足以下条件：非叶结点的数据大于或等于其左
	 * 、右孩子结点的数据（若是按从大到小的顺序排序，则要求非叶结点的数据小于或等于其左、右孩子结点的数据）。
	 * 
	 * 由堆的定义可看出，其根结点为最大值，堆排序就是利用这一特点进行的。堆排序过程包括两个阶段：
	 * 
	 * （1）将无序的数据构成堆（即用无序数据生成满足堆定义的完全二叉树）。
	 * 
	 * （2）利用堆排序（即用上一步生成的堆输出有序的数据）。
	 */
	public void heapSort(int[] a) {
		for (int i = a.length / 2; i >= 0; i--) {/* 把数组构成成大顶堆 */
			headAdjust(a, i, a.length - 1);
		}
		for (int i = a.length - 1; i > 0; i--) {/* 把第一个元素和未排序的最后一个交换，然后把新的再构造大定堆 */
			swap(a, 0, i);
			headAdjust(a, 0, i - 1);
		}
	}

	/* 调整堆 */
	private void headAdjust(int[] a, int s, int end) {
		int temp = a[s];
		for (int j = 2 * (s + 1) - 1; j <= end; j = (j + 1) * 2 - 1) {
			if (j < end && a[j] < a[j + 1])
				++j;
			if (temp >= a[j])
				break;
			a[s] = a[j];
			s = j;
		}
		a[s] = temp;
	}

	/*****************
	 * 归并排序（递归方式实现） ***************** 归并排序（Merge Sort）就是将两个或多个有序表合并成一个有序表。
	 */
	void mergeSort(int[] a) {
		int[] temp = new int[a.length];// 用于暂时存放数据内容
		mSort(a, temp, 0, a.length - 1);
	}

	private void mSort(int[] a, int[] temp, int s, int e) {
		int mid = (s + e) / 2;
		if (s == e)
			return;// 相等表示只有一个，不用排序，直接返回
		mSort(a, temp, s, mid);/* 递归调用 */
		mSort(a, temp, mid + 1, e);
		/* 因为每次调用排序后的数组和原来数组a[]不相同了，而我们要的是后来改变的数组，所以只能在这里初始化temp */
		for (int i = s; i <= e; i++) {
			temp[i] = a[i];
		}
		int i1 = s;
		int i2 = mid + 1;
		for (int cur = s; cur <= e; cur++) {/* 实现数组归并 */
			if (i1 == mid + 1) {
				a[cur] = temp[i2++];
			} else if (i2 == e + 1) {
				a[cur] = temp[i1++];
			} else if (temp[i1] < temp[i2]) {
				a[cur] = temp[i1++];
			} else {
				a[cur] = temp[i2++];
			}
		}
	}

	/********************
	 * 快速排序 ************************* 快速排序使用分治策略来把待排序数据序列分为两个子序列，具体步骤为：
	 * 
	 * （1）从数列中挑出一个元素，称该元素为“基准”。
	 * 
	 * （2）扫描一遍数列，将所有比“基准”小的元素排在基准前面，所有比“基准”大的元素排在基准后面。
	 * 
	 * （3）通过递归，将各子序列划分为更小的序列，直到把小于基准值元素的子数列和大于基准值元素的子数列排序。
	 */
	void quickSort(int[] a) {
		qSort(a, 0, a.length - 1);
	}

	private void qSort(int[] a, int low, int high) {
		int pivot;/* 此值为使得啊a[pivot]大于前面所以值，也大于后面所有值 */
		if (low < high) {
			pivot = partition(a, low, high);
			qSort(a, low, pivot - 1);
			qSort(a, pivot + 1, high);
		}
	}

	int partition(int[] a, int low, int high) {
		int pivotKey = a[low];// 选择最低处的数为区抽数
		while (low < high) {
			while (low < high && pivotKey <= a[high])
				high--;
			swap(a, low, high);
			while (low < high && pivotKey >= a[low])
				low++;
			swap(a, low, high);
		}
		return low;
	}

	/*************************************** end ********************************************************************/

	// 交换
	private void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	// 打印数组
	public void print(int[] a) {
		for (int i = 0; i < a.length; ++i) {
			System.out.println(a[i]);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sort sort = new Sort();
		int a[] = { 112, 55, 42, 7, 14, 5, 74, 5445, 5 };
		long start = System.nanoTime();
		// sort.betterBubbleSort(a);
		// sort.bubbleSort(a);
		// sort.insertSort(a);
		// sort.bubbleSort(a);
		// sort.selectSort(a);
		// sort.shellSort(a);
		// sort.heapSort(a);
		// sort.mergeSort(a);
		sort.quickSort(a);
		System.out.println(System.nanoTime() - start);
		sort.print(a);

	}

}
