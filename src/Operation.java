public class Operation {

    private double result;

    public void add(double x, double y){}

    public void subtract(double x,double y){}
    public void multiply(double x, double y){}
    public void divide(double x,double y){}
    public void show(){
        System.out.println("wynik dzialania = "+result);
    }
    public void set(double r){
        this.result=r;
    }
    public double get(){
        return result;
    }

}
