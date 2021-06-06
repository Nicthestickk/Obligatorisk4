public class Main {
    //In our main method we show that we can now use methods used in the superclass to subclasses.
    public static void main(String[] args) {
        Volvo vl = new Volvo();
        BMW bmw = new BMW();
        Volvo.engineOn();
        Volvo.engineOff();
        BMW.engineOn();
    }
}
