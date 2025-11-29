public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bodymass = 105;
        double heigh = 1.89;

        int index = (int) (bodymass / (heigh * heigh));


        System.out.println(index);
    }

}