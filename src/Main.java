public class Main {
    public static void main(String[] args) {

        patternMatching();

        record();

    }

    private static void record() {

        Point point = new Point(1, 1);
        point.x();  // utilisation de l'accesseur pour l'attribut x
    }

    private static void patternMatching() {
        Object obj = null;

        // Automatically instantiate a new object
        if(obj instanceof Integer intValue){
            // use intValue
        }
    }
}