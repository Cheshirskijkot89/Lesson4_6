package chizhenko;

public class Main {

	public static void main(String[] args) {

		int count;
		// int number;
		boolean type;

		count = 0;

		for (int i = 1; i <= 100; i++) {

			type = true;

			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					count = count + 1;
				}
				;

				if (i == 1) {
					System.out.println(i);
				} else {
					if (count > 2) {
						count = 0;
						type = false;
					}
					;

				}
				;

			}
			count = 0;		
			if (type & i != 1) {
				System.out.println(i);
			}

		}

	}

}
