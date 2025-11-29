public class BmiService {
    public int calculate(int bodymass, int heigh) {


        int index = bodymass / (heigh * heigh);


        return index;
    }
}
