public class Audi {

    public static void main(String[] args) {

        car audi = new car();
        audi .setColor("red");
        audi.setSize(60);
        audi.setWeight(60.12);
        audi.displaycar();

        car.accelerator();
        car.start();

        String a = "A";

        displayLogo( "A");
        displayLogo("100");
    }

    public static void displayLogo(String s1) {
        System.out.println("Logo is:" +s1);
    }

}

