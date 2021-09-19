import java.util.Scanner;
public class Edi {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
            x += x * 15/100;
			System.out.println("Gaji Pak Edi = " + x);

        }
    }