package algo;

public class AllCombinations {

	public void permutation(char[] firstArr, int left, int size) {
		int x;
		if (left == size) {
			for (int i = 0; i < firstArr.length; i++) {
				System.out.print(firstArr[i]);
			}
			System.out.print(" ");
		} else {
			for (x = left; x < size; x++) {
				swapChar(firstArr, left, x);
				permutation(firstArr, left + 1, size);
				swapChar(firstArr, left, x);
			}
		}
	}

	public void swapChar(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) throws java.lang.Exception {
		String s = "abc";
		char[] arrCh = s.toCharArray();
		AllCombinations i = new AllCombinations();
		i.permutation(arrCh, 0, arrCh.length);
	}
}