public class Déboggage {
	public static boolean[] filtre(float[] tab, float max) {
		boolean[] resultat = new boolean[tab.length];
		for (int i = 0; i < tab.length; i++) { //
			if (tab[i] < max) { //
				resultat[i] = true;
			} else { //
				resultat[i] = false;
			}
		}
		return resultat;
	}

}
