package tictactoe;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] ch = str.toCharArray();
        System.out.println("---------");
            System.out.print("| ");
            System.out.print(ch[0]);
            System.out.print(" ");
            System.out.print(ch[1]);
            System.out.print(" ");
            System.out.print(ch[2]);
            System.out.print(" |");
            System.out.println();
            System.out.print("| ");

            System.out.print(ch[3]);
            System.out.print(" ");
            System.out.print(ch[4]);
            System.out.print(" ");
            System.out.print(ch[5]);
            System.out.print(" |");
            System.out.println();
            System.out.print("| ");
            System.out.print(ch[6]);
            System.out.print(" ");
            System.out.print(ch[7]);
            System.out.print(" ");
            System.out.print(ch[8]);
            System.out.println(" |");
            System.out.print("---------");
        }
    }

