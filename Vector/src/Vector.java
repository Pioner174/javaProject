import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Vector {
    public double create(double[] a){
    return 0;
    }
    public double[] createK(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты для вектора!\n" + "Введите координату x: " );
        double[] vector = new double[3];
        vector[0] = sc.nextDouble();
        System.out.println("Введите координату y: ");
        vector[1] = sc.nextDouble();
        System.out.println("Введите координату z: ");
        vector[2] = sc.nextDouble();
        return vector;
    }
    public String puty(){
        System.out.println("Введите название вектора: ");
        Scanner sc = new Scanner(System.in);
        return sc.toString();
    }
}
