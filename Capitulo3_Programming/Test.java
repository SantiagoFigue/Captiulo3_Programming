package Capitulo3_Programming;

public class Test {

	public static void main(String[] args) {
		ArithmeticMethods nuevo= new ArithmeticMethods();
		System.out.println(nuevo.displayNumberPlus10());
		System.out.println(nuevo.displayNumberPlus100());
		System.out.println(nuevo.displayNumberPlus1000());
		
		ArithmeticMethods2 nuevo1=new ArithmeticMethods2(5, 5);
		System.out.println(nuevo1.displayNumberPlus10());
		
		Percentages nuevo3 = new Percentages();
		System.out.println(nuevo3.porcentajes());
		
		Percentages2 nuevo4=new Percentages2(2.0, 5.0);
		System.out.println(nuevo4.porcentajes());
		
		GasPrice gas= new GasPrice(120);
		System.out.println(gas.precios());
		
		MetricConversion mt= new MetricConversion(33);
		System.out.println(mt.pulCent());
		System.out.println(mt.galLit());
		
		PaintCalculator pt=new PaintCalculator(15, 10, 20);
		System.out.println(pt.calcularArea());
		System.out.println(pt.numeroGalones());
		System.out.println(pt.costo());
		
		Insurance ky=new Insurance(2019,1985);
		System.out.println(ky.poiliza());
		
		Salary s=new Salary(2,8,8);
		System.out.println(s.pagohorex());
		
		Interest iu=new Interest(100);
		System.out.println(iu.total());
		
		Sandwich sa=new Sandwich("Cecina", "Blanco", 25.0);
		System.out.println(sa.ticket());
		
		Student st=new Student(3, 3, 12);
		System.out.println(st.promedio());
		
		BankAccount bc = new BankAccount(355,"Santiago",8555.36);
		System.out.println(bc.showValues());
		
		Painting pt1=new Painting("Roja", "Santiago", "x", 18.55, 258.36);
		System.out.println(pt1.getNombre());
	}
}
