package principal;

import figura.Circulo;

/**
 * Programa principal que usa los métodos de la clase Circulo
 * @author Guillermo Casas Reche
 * @author g.casas.r94@gmail.com
 * @version 1.0
 * @see <a href='http://guillermocasas.com'>Mas información</a>
 */
public class Main {

    /**
     * Punto de entrada único para el proyecto
     * 
     * <ul>
     *      <li> Utiliza métodos areCirculo
     *      <li> Utiliza método perimetoCirculo
     *      <li> Utiliza moveCirculo
     *      <li> Utiliza el método GET para obtener Centrox y Centroy
     * </ul>
     * @param args es un array de tipo String
     */
    public static void main(String[] args) {
       double centrox=1;
       double centroy=1;
       double radio=5;
       Circulo c1= new Circulo(centrox,centroy,radio);
       System.out.println("Area del circulo="+c1.areCirculo());
       System.out.println("Perimetro del circulo= "+c1.perimetroCirculo());
       c1.moveCirculo(10,10);
       System.out.println("Centro x nuevo= "+c1.getCentrox());
       System.out.println("Centro y nuevo= "+c1.getCentroy());
    }
    
}
