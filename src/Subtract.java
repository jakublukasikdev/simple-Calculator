public class Subtract extends Operation {
    @Override
    public void  subtract(double x, double y){
        double s=x-y;
        super.set(s);
    }

    @Override
    public void show(){
        System.out.println("wynik odejmowania = "+super.get());
    }
}
