public class car {

    private String color;
    private int size;
   private double weight;

    public static void start(){
        System.out.println("Press the start");
    }
    public static void  accelerator(){
        System.out.println("press the acceleration");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int setSize(int size) {
        this.size = size;


        return size;
    }

    public double setWeight(double weight ) {
        this .weight= weight;


        return weight;
    }
    public void displaycar(){
        System.out.println("color of the car: " +color);
        System.out.println("size of the car : " +size);
        System.out.println("weight of the car : " +weight);
    }
}
