package DemoBusquedaLineal;

import java.util.Scanner;

public class DemoBusquedaLineal {
	public static int busquedaLineal(int A[], int n, int buscado) {
		int indice = 0;
		while(indice <n) {
			if(A[indice] == buscado) {
				return indice;
			}
			indice = indice + 1;
		}
		return -1;
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		System.out.println("Tamaño del arreglo: ");
		int n = sc.nextInt();
		
		int A[] = new int[n];
		
		System.out.println("Ingrese los elementos del arreglo: ");
		for (int i = 0; i < n; i++) {
			System.out.print("Elemento [" + i + "] =");
			A[i]= sc.nextInt();
		}
		System.out.println("Elemento a buscar en el arreglo: ");
		int buscado = sc.nextInt();
		
		int resultado = busquedaLineal(A, A.length, buscado);
		
		if (resultado != -1) {
			System.out.println("El elemento " + buscado + "fue encontrado en " + resultado );
		}else {
			System.out.println("El elemento " + buscado + " no fue encontrado ");
		}
		sc.close();
		

	}

}
