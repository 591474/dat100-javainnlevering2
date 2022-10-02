package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for(int[] rad : matrise) {
			for(int x : rad) {
				System.out.print(x+" ");	
			}
			System.out.println();
		}
		
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String svar="";
		
		for(int[] rad : matrise) {
			for(int x : rad) {
				svar=svar+x+" ";
			}
			svar=svar+"\n";
		}
		return svar;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] svar= new int[matrise.length][];
		for(int i =0; i< svar.length;i++) {
			svar[i]=new int[matrise[i].length];
		}
		int i=0;
		for(int[] rad : matrise) {
			int j=0;
			for(int x : rad) {
				svar[i][j]=x*tall;
				j++;
			}
			i++;
		}
		return svar;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean svar=true;
		int i=0;
		for(int[] rad : a) {
			int j=0;
			for(int x : rad) {
				if(b[i][j]!=x)svar=false;
				j++;
			}
			i++;
		}
		return svar;
		
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
