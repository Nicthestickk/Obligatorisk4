public class BMW extends Car {
    //This is a subclass of the superclass
    //Here we extends the class so that we can take methods from the superclass
    String color = "gray";
    //In this subclass we use the exact same method as in the Car class
    //The method will then override and use this one instead
    public static void engineOn(){
        System.out.println("Engine is ready and rollin!");
    }
}
