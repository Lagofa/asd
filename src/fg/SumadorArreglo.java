package fg;

public class SumadorArreglo {
	public int sumarPosicionesPares(int[] arreglo) {
		int sumaElementosEnPosicionesPares = 0;
		if (arreglo == null) {
			throw new Error("No existe el arreglo");
		}
		for (int indice = 0; indice < arreglo.length; indice++) {
			if (indice % 2 == 0) {
				sumaElementosEnPosicionesPares += arreglo[indice];
			}
		}
		return sumaElementosEnPosicionesPares;
	}
}
