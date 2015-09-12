package lab1_Marcus;

import org.apache.poi.ss.formula.functions.FinanceLib;

public class Lab_1_marcus {

	public static void main(String[] args) {
		double r;
		double n;
		double y;
		double p;
		double f;
		boolean t;
		
		double PV;
		r = (0.02/12);
		n = 20*12;
		y = 10000-2642;
		f = 0;
		t = false;
		
		PV = FinanceLib.pv(r,n,y,f,t);
		
		System.out.println(PV);
		
		double PMT;
		
		r = (.07/12);
		n = 40*12;
		p = 0;
		f = PV;
		t = false;
		
		PMT = FinanceLib.pmt(r,n,p,f,t);
		
		System.out.println(PMT);
				
				

	}

}
