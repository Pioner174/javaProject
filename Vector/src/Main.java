import java.util.*;

public  class Main {
    public static void main(String[] args){
    Main main = new Main();
     Map<String, double[]> vectors = new HashMap<String, double[]>();
//    System.out.println(Arrays.toString(main.createK()));

        while (true){
            System.out.println("Cозданные векторы: ");
            main.display(vectors);
            vectors.put( main.puty(), main.createK());

        }
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
        String a = sc.next();
        return a;
    }
    public void display(Map<String, double[]> z){
        for (Map.Entry<String, double[]> entry: z.entrySet()) {

            System.out.printf(entry.getKey() + Arrays.toString(entry.getValue())+"\n");
//            System.out.println(Arrays.toString(z.values()));
        }
    }
    public double LongVector(double[]  k){
    return Math.sqrt(k[0]*k[0]+k[1]*k[1]+k[2]*k[2]);
    }


}
