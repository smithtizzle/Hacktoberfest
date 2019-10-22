package ordenacao;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = {3,5,6,2,8,6,5,5};
		selection(a);
		System.out.println(Arrays.toString(a));
	}

	private static void selection(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int menor = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[menor])
					menor = j;
			}
			trocar(a,menor,i);
		}
		
		
	}

	private static void trocar(int[] a, int menor, int i) {
		int aux = a[menor];
		a[menor] = a[i];
		a[i] = aux;
		
	}

}
