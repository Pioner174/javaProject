import java.util.*;
public class main {
    public static void main(String[] args){
    main main = new main();
    Scanner scan = new Scanner(System.in);
    System.out.println(Arrays.toString(main.in(scan.nextInt())));


}
    public int[] in (int chislo){

        int[] out ={chislo-3,chislo-1,chislo,chislo+1,chislo+3};
        return out;
    }
}
