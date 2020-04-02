package figura;

/**
 * @author Guillermo Casas Reche
 * @author g.casas.r94@gmail.com
 * @version 1.0
 * @see <a href='http://guillermocasas.com'>Mas información</a>
 */
public class Circulo {
    private double centrox;
    private double centroy;
    private double radio;
    
    /**
     * Constructor de la clase Circulo que no recibe ningún parámtero
     */
    public Circulo(){
    }
    
   /**
    * Constructor de la clase Circulo que recibe los parámetros
    * @param centrox Valor Double que determina el valor X
    * @param centroy Valor Double que determina el valor Y
    * @param radio Valor Double que determina el radio
    */
    public Circulo (double centrox, double centroy, double radio){
        this.centrox=centrox;
        this.centroy=centroy;
        this.radio=radio;
    }
    
    /**
     * Método Get para obtener Centrox
     * @return Nos devuelve centrox
     */
    public double getCentrox(){
        return centrox;
    }
    
    /**
     * Método Set para modificar el valor centrox
     * @param centrox Valor Double que contendrá el objeto creado
     */
    public void setCentrox(double centrox){
        this.centrox=centrox;
    }
    
    /**
     * Metodo Get para obtener Centroy
     * @return Nos devuelve centroy
     */
    public double getCentroy(){
        return centroy;
    }
    
    /**
     * Metodo Set para modificar el valor centrox
     * @param centroy Valor Double que contendrá el objeto creado
     */
    public void setCentroy(double centroy){
        this.centroy=centroy;
    }
    
    /**
     * Método Get para obtener el radio
     * @return Nos devuelve el radio
     */
    public double getRadio(){
        return radio;
    }
    
    /**
     * Método Set para modificar el valor del radio
     * @param radio Valor Double que contendrá el objeto creado
     */
    public void setRadio(double radio){
        this.radio=radio;
    }
    
    /**
     * Método para obtener un String ya formateado de los valores que tiene el objeto creado
     * @return Nos devuelve el Strin con los valores
     */
    @Override
    public String toString(){
        return "Ciculo{centrox="+ centrox +", centroy="+ centroy +", radio="+ radio +"}"; 
    }
    
    /**
     * Método para obtener el perímetro del círculo 
     * @return Valor Double del perímetro
     */
    public double perimetroCirculo(){
        return 2*Math.PI*this.radio;
    }
    
   /**
     * Método para obtener el area del círculo
     * @return Valor Double del perímetro del círculo
     */
    public double areCirculo(){
        return Math.PI*Math.pow(this.radio,2);
    }
    
   /**
     * Método para la modificación de los valores centrox y centroy, sumandole los valores que le mandemos. Similar a un método Set, pero el valor que entregamos al método se sumará los valores de dicho objeto
     * @param deltax Valor Doble que recibirá el método y al que se sumará al centrox del objeto creado
     * @param deltay Valor Doble que recibirá el método y al que se sumará al centroy del objeto creado
     */
    public void moveCirculo(double deltax, double deltay){
        this.centrox=this.centrox+deltax;
        this.centroy=this.centroy+deltay;
    }
    
    /**
     * Método para escalar el círculo por medio de la modificación del radio. Parecido a un método Set pero el valor que entregamos al método se sumará al radio de dicho objeto
     * @param s Valor Double que recibirá el método y al que sumará al radio del objeto
     */
    public void escalaCirculo(double s){
        this.radio=this.radio*s;
    }
}
