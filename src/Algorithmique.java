public class Algorithmique {
	public static int diagDiff(int[][] matrice) {
		int diag1 = 0;
		int diag2 = 0;
		for (int i = 0; i < matrice.length; i++) {
			diag1 = diag1 + matrice[i][i];
			diag2 = diag2 + matrice[matrice.length - i][i];
		}
		return (Math.abs(diag1 - diag2));

	}

	public static boolean find(int[] tab, int nb) {
		int j = 0;
		int y = 0;
		int temp = nb;
		int[] tab2 = new int[(int) (Math.log10(nb) + 1)];
		while (nb > 1) {
			tab2[j] = temp % 10;
			j++;
			temp = temp / 10;
		}
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] == tab2[y]) {
				int sum = 0;
				for (int z = 1; z < (int) (Math.log10(nb) + 1); z++) {
					y++;
					if (tab[i + z] == tab2[y]) {
						sum++;
					}
				}
				if (sum == (int) (Math.log10(nb))) {
					return (true);
				}

			}

		}
		return (false);

	}

	static void tribulle(int[] T) { //C'est la méthode du tri à bulle
		boolean permut;
		int inter;

		do {
			permut = false;
			for (int i = 0; i < T.length - 1; i++) {
				if (T[i] > T[i + 1]) {
					inter = T[i];
					T[i] = T[i + 1];
					T[i + 1] = inter;
					permut = true;

				}

			}
		} while (permut != false);

	}

}
