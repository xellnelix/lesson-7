package ru.otus.lesson7;

public class Main {
	public static void main(String[] args) {
		int[][] testArray = new int[3][3];
		fillArray(testArray);
		System.out.println("Initialized array is: ");
		printArray(testArray);
		System.out.println("sumOfPositiveElements: ");
		int result = sumOfPositiveElements(testArray);
		System.out.println(result);
		System.out.println("\nprintSquare: ");
		printSquare(7);
		System.out.println("nullifyDiagonal: ");
		nullifyDiagonal(testArray);
		printArray(testArray);
		System.out.println("findMax: ");
		int findMaxRes = findMax(testArray);
		System.out.println(findMaxRes);
		System.out.println("\nsumSecondString: ");
		int res = sumSecondString(testArray);
		System.out.println(res);
	}

	public static void fillArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * (10 - 1) + 1);
				arr[i][j] *= Math.random() > 0.5 ? 1 : -1;
			}
		}
	}

	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static int sumOfPositiveElements(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > 0) {
					sum += arr[i][j];
				}
			}
		}
		return sum;
	}

	public static void printSquare(int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void nullifyDiagonal(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j || i == arr.length - 1 - j) {
					arr[i][j] = 0;
				}
			}
		}
	}

	public static int findMax(int[][] arr) {
		int max = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		return max;
	}

	public static int sumSecondString(int[][] arr) {
		if (arr.length < 2) {
			return -1;
		}
		int sum = 0;
		for (int j = 0; j < arr[1].length; j++) {
			sum += arr[1][j];
		}
		return sum;
	}
}