public class practice {
	public static void main(String[]args) {
		int[] ist = {9, 8, 4, 2, 6, 3, 5, 1};
		for (int j = 0; j < ist.length; j++) {
			for(int i = 0; i < ist.length - 1 - j; i++) {
				if (ist[i]> ist[i + 1]) {
					int temp = ist[i];
					ist[i] = ist[i + 1];
					ist[i+1] = temp;
				}
			}
			}
		
		for (int i = 0; i < ist.length; i++) {
			System.out.print(ist[i] + " ");
		}
}
}

