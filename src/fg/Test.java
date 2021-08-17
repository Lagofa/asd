package fg;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Assert;

public class Test {
	private SumadorArreglo sumador = new SumadorArreglo();
	
	@org.junit.Test
	public void sumarArregloVacioDevuelveCero() {
		
		//Prepación
		int[] arregloTest = {};
		
		//operaciónn
		int resultado = sumador.sumarPosicionesPares(arregloTest);
		
		//verficación
		Assert.assertEquals(0, resultado);
	}
	
	@org.junit.Test
	public void sumarArregloNuloDevuelveError() {
		
		//Prepación
		int[] arregloTest = null;
			
		//operaciónn
		assertThrows(Error.class, () -> {
			sumador.sumarPosicionesPares(arregloTest);
	    });
		
	}
	
	@org.junit.Test
	public void sumarArregloDeTamanoPar() {
		
		//Prepación
		int[] arregloTest = {1, 2, 13 ,4, 8, 6};
					
		//operaciónn
		int resultado = sumador.sumarPosicionesPares(arregloTest);
		
		//verficación
		Assert.assertEquals(22, resultado);
	}
	
	@org.junit.Test
	public void sumarArregloDeTamanoParImpar() {
		
		//Prepación
		int[] arregloTest = {1, 2, 13 ,4, 8, 6, -22};
					
		//operaciónn
		int resultado = sumador.sumarPosicionesPares(arregloTest);
		
		//verficación
		Assert.assertEquals(0, resultado);
	}
}
