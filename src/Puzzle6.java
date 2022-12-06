import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Puzzle6 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Puzzle6.txt"));
        String s = sc.nextLine();

        char[] S = s.toCharArray();
        int counter = 0;


        for (int i = 0; i < S.length - 4; i++) {
                /*int a = S[i];
                int b = S[i+1];
                int c = S[i+2];
                int d = S[i+3];

                if (a != b && a != c && a!=d && b!= c && b!=d && c!=d) {
                    counter = i+3;
                }*/
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < 14; j++) {
                set.add(S[i+j]);
            }
            if (set.size() == 14) {
                counter = i + 14;
                break;
            }
        }

        System.out.println(counter);
        System.out.print(S[counter - 3]);
        System.out.print(S[counter - 2]);
        System.out.print(S[counter - 1]);
        System.out.print(S[counter]);


    }
}
