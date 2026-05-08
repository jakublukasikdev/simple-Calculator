public class Add extends Operation{
    @Override
    public void  add(double x, double y){
        double s=x+y;
        super.set(s);
    }

    @Override
    public void show(){
        System.out.println("wynik dodawania = "+super.get());
    }
}
