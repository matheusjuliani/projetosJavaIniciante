import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tab = 0;
        for (int i = 1; i < 11; i++){
            for(int j = 1; j < 11;j++){
               tab = i*j;
                System.out.println(i+" x " + j + "= " + tab);
            }
            System.out.println("----------");
        }
        int N;
        int tab2;
        System.out.println("Qual numero deseja a tabuada?");
        N = sc.nextInt();

        for (int i = 0; i < 11; i++){
           tab2 = i*N;
            System.out.println(i + " x " + N + "= " + tab2);
        }






    }
}