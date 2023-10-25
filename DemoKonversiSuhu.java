package oop3_2;

public class DemoKonversiSuhu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
KonversiSuhu2 ks2 = new KonversiSuhu2();
System.out.println("Celcius = 15 ke Fahrenheit = " + ks2.celciusToFahrenheit(15));
System.out.println("Celcius = 15 ke Reamur = " + ks2.celciusToReamur(45));
System.out.println("Fahrenheit = 20 ke Reamur = " + ks2.fahrenheitToReamur(20));
}
}