package ar.edu.unlam.dominio;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CartaTest {

	public void miTest() {
    		
		// Preparacion : informacion necesaria para ejecutar prueba (if x ejemplo, caminos que va tomando el codigo) 
		
		// Ejecucion : ejecutar el metodo a probar
		
		// Verificacion : verificar que le escenario final sea el que se requiere
		
		// Lineamientos : escribir metodo, ejecutar y debe fallar 
		
	}
	@Test
	public void crearCarta() {
		carta carta = new carta();
		int saludRequerida = 100;
		int danio = carta.danioACarta(10);
		carta.curarse();
		int saludDeLaCarta = carta.getsaludDeCarta();
		assertEquals(saludRequerida, saludDeLaCarta);
	}
}
