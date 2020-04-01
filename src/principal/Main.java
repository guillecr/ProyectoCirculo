package principal;

import figura.Circulo;

/**
 *
 * @author Guillermo
 */
public class Main {

    /**
     * @param args the command line arguments
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
