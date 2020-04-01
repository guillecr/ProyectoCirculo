package figura;

/**
 *
 * @author Guillermo
 */
public class Circulo {
    private double centrox;
    private double centroy;
    private double radio;
    public Circulo(){
    }
    public Circulo (double centrox, double centroy, double radio){
        this.centrox=centrox;
        this.centroy=centroy;
        this.radio=radio;
    }
    public double getCentrox(){
        return centrox;
    }
    public void setCentrox(double centrox){
        this.centrox=centrox;
    }
        public double getCentroy(){
        return centroy;
    }
    public void setCentroy(double centroy){
        this.centroy=centroy;
    }
        public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio=radio;
    }
    @Override
    public String toString(){
        return "Ciculo{centrox="+ centrox +", centroy="+ centroy +", radio="+ radio +"}"; 
    }
    public double perimetroCirculo(){
        return 2*Math.PI*this.radio;
    }
    public double areCirculo(){
        return Math.PI*Math.pow(this.radio,2);
    }
    public void moveCirculo(double deltax, double deltay){
        this.centrox=this.centrox+deltax;
        this.centroy=this.centroy+deltay;
    }
    public void escalaCirculo(double s){
        this.radio=this.radio*s;
    }
}
