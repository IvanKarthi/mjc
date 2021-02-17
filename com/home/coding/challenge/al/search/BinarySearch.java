package com.home.mjc.al.search;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 7, 9, 11, 17, 24, 38, 16 };
		int[][] matrix = { { 1, 5, 9, 11 }, { 13, 16, 19, 24 }, { 28, 30, 38, 50 } };
		int target = 11;
		int result;
		
		//result = binarySearchIterative(nums, target);	//Iterative way
		//result = binarySearchRecursive(nums, target, 0, nums.length - 1);	//Recursive way
		result = arraysBinarySearch(nums, target);	//Arrays method
		searchMatrix(matrix, target);
		if (result >= 0) {
			System.out.printf("The element %d exists at index %d in the array", target, result);
		} else {
			System.out.printf("The element %d doesn't exist in the array", target);
		}
	}

	private static int arraysBinarySearch(int[] nums, int target) {
		int result = Arrays.binarySearch(nums, target);
		return result;
	}

	private static int binarySearchIterative(int[] nums, int target) {
		int start = 0, end = nums.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (target == nums[mid]) {
				return mid;
			} else if (target < nums[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	private static int binarySearchRecursive(int[] nums, int target, int start, int end) {
		if (start > end) {
			return -1;
		}
		int mid = (start + end) / 2;
		if (target == nums[mid]) {
			return mid;
		} else if (target < nums[mid]) {
			return binarySearchRecursive(nums, target, start, mid - 1);
		} else {
			return binarySearchRecursive(nums, target, mid + 1, end);
		}
	}

	private static void searchMatrix(int[][] matrix, int target) {

	}
}
