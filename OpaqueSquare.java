package PatternPrograms;

import java.util.Scanner;

public class OpaqueSquare {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] Ak) throws Exception{

        System.out.print("Enter the value of N(No.of lines) to do printing: ");
        int n = sc.nextInt();
        System.out.println();

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if ((i==0||i==n-1)||(j==0||j==n-1)){
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            Thread.sleep(500);
            System.out.println();
        }

    }
}
