class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("write something");
    }

    public void printcolor(){
        System.out.println(this.color);
     }
    public void printtype(){
        System.out.println(this.type);
    }

}
public class OOPS{
    public static void main(String args[]){
        Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type="gel";

        pen1.printcolor();
        pen1.printtype();
    }
}