package PracticaVectores;
import org.junit.Test;
import static org.junit.Assert.*;

public class TableroTest {

  @Test public void testIniciarMatriz() {
    Tablero tablero = new Tablero(3,3);
    // int[][] aaa = {{0,1,2},{1,0,0},{2,0,0}};
    // assertArrayEquals(aaa == tablero.iniciarMatriz());
  }

  // @Test public void testPrintMatriz() {
  //   Tablero tablero = new Tablero(10,10);
  //   assertTrue(matriz[10][10] == tablero.iniciarMatriz());
  // }
}
// 	public void printMatriz(int a, int b) {
// 		System.out.println("\nLa posicion de X en coordenadas ("+x+","+y+") es:\n");
// 		for (int i=0; i<filas; i++) {
// 			for (int j=0; j<columnas; j++) {
// 				if (i == a && j == b) {
// 					System.out.print("X" + " ");
// 				}
// 				else {
// 					System.out.print(matriz[i][j] + " ");
// 				}
// 			}
// 			System.out.println(" ");
// 		}
// 	}
// }
