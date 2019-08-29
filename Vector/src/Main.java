import java.util.*;

public  class Main {
    public static void main(String[] args){
    Main main = new Main();
     Map<String, double[]> vectors = new HashMap<String, double[]>();
//    System.out.println(Arrays.toString(main.createK()));
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Cозданные векторы: ");
            main.display(vectors);
            System.out.println("Выберите пунк из меню: \n" + "1) Добавить вектор;   " + "2) Вычислить длину вектора;\n" + "3) Вычисляющий скалярное произведение двух векторов;");
            switch (scan.nextInt()) {
                case (1):
                    vectors.put(main.puty(),main.createK());
                    break;
                case (2):
                    System.out.println("Введите название вектора:");
                    System.out.println("Результат: " + main.LongVector(vectors.get(scan.next())));
                    break;
                case (3):
                    System.out.println("Введите название 1-го вектора:");
                    String a = scan.next();
                    System.out.println("Введите название 2-го вектора:");
                    String b = scan.next();
                    System.out.println("Результат: " + main.scproiz(vectors.get(a),vectors.get(b)));
                    break;
            }
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
    public double scproiz(double[]  k,double[]  v){
       return k[0]*v[0]+k[1]*v[1]+k[2]*v[2];
    }

}
