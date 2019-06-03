import java.awt.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import net.datastructures.ArrayList;
import net.datastructures.LinkedPositionalList;
import net.datastructures.Position;
import net.datastructures.PositionalList;



public class Interval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] matrice = new Integer [5];
		Random rand = new Random();
		for(int i=0; i<matrice.length; i++) {
			matrice[i]=rand.nextInt(9);
		}
		
		for(int j=0; j<matrice.length; j++) {
			System.out.println(matrice[j]);
		}
		cautareSumaMaxima(matrice);
		
		}
	
		public static void cautareSumaMaxima(Integer [] v) {
//			Integer [] m1=new Integer[5];
//			Integer [] m2=new Integer[5];
//			int counter1=0;
//			int counter2=0;
			Integer max=v[0];
			for(int i=0; i<v.length;i++) {
				if(v[i]>max) {
					max=i;
				}
			}
			System.out.println("Indice max: "+max);
			int first, second;
			if(v[0]>v[1]) {
				first=v[0];
				second=v[1];
			}
			else {
				first=v[1];
				second=v[0];
			}
			
			for(int j=2;j<v.length;j++) {
				if(v[j]>first) {
					second=first;
					first=j;
				}
				else if(v[j]>second && v[j]!=first) {
					second=j;
				}
			}
			System.out.println("Indice second: "+second);
			
			Integer suma=0;
			for(int i=second; i<max; i++) {
				suma = v[i+1]+v[max-1];
				
			}
			System.out.println("Suma este:"+suma);
			}
			
		}
		
		
		
	


