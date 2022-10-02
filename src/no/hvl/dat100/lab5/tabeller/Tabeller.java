package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for(int i =0; i< tabell.length;i++) {
			System.out.println(tabell[i]);	
		}

	}

	// b)
	public static String tilStreng(int[] tabell) {
		String svar ="[";
		for(int i =0; i< tabell.length;i++) {
			if(i==tabell.length-1) {
				svar=svar+tabell[i];
			}
			else {
				svar=svar+tabell[i]+",";		
			}	
		}	
		svar=svar+"]";
		return svar;
	}

	// c)
	public static int summer(int[] tabell) {
		int svar=0;
		for(int i =0; i< tabell.length;i++) {
			svar=svar+tabell[i];
		}		
		return svar;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean svar=false;
		for(int i : tabell) {
			if (i==tall) {
				svar=true;
			}
		}
		return svar;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int svar=-1;
		for(int i =0;i<tabell.length;i++) {
			if(tall==tabell[i]) {
				svar = i;
			}
		}
		return svar;
	}
	
	// f)
	public static int[] reverser(int[] tabell) {
		int j = tabell.length;
		int[] svar = new int[j];
		for(int i =0;i<tabell.length;i++) {
			svar[j-1]=tabell[i];
			j--;
		}
		return svar;	
	}

	// g)
	public static boolean erSortert(int[] tabell) {
boolean svar=true;
		
		for(int i =0; i< tabell.length;i++) {
			int siste=i-1;
			if(siste<0) {
				siste=0;
			}
			if(tabell[i]<tabell[siste]) {
				svar=false;
			}	
		}
		return svar;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int lengde = tabell1.length + tabell2.length;
		int[] svar = new int[lengde];
		int i=0;
		for(int j : tabell1) {
			svar[i] = j;
			i++;
		}
		for(int j : tabell2) {
			svar[i] = j;
			i++;
		}
		return svar;
	}
}
