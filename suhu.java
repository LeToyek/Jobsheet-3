import java.util.Scanner;
public class suhu {
        public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			float suhu, celcius, reamur, farenheit, kelvin;
			suhu = sc.nextFloat();
			celcius = suhu;
			reamur = (celcius*4/5);
			farenheit = ((celcius*9/5) + 32);
			kelvin = celcius + 273;
			
			System.out.println("celcius = " + celcius);
			System.out.println("reamur = " + reamur);
			System.out.println("farenheit = " + farenheit);
			System.out.println("kelvin = " + kelvin);
			
			
		}
}