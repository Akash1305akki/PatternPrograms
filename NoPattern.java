package PatternPrograms;
import java.util.Scanner;

public class NoPattern {

    static Scanner x = new Scanner(System.in);
    public static void main(String[] Ak) {
        int n = 1;

        System.out.print("Enter the number of rows: ");
        int r = x.nextInt();

        for (int i=0;i<r;i++){
            for (int j=0;j<r;j++){
                if (i>=j){
                    if (j==0){
                        System.out.print(n+" ");
                    }else {
                        int temp = 0;
//                        int k = r-1;
//                        while(k != r-(j+1)){
//                            temp += k;
//                            k--;
//                        }
                        for (int k = r-1;k!=r-(j+1);k--){
                            temp += k;
                        }
                        System.out.print((n+temp)+" ");
                    }
                }
            }
            n++;
            System.out.println();
        }
    }
}