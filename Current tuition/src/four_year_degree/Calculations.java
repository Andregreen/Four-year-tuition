package four_year_degree;
import java.util.Scanner;
public class Calculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.print("Cost of tuition: ");
		int tuition=input.nextInt();
		
		System.out.print("Percent of increase: ");
		float percent=input.nextFloat();
		
		float decimal_percent=percent/100;
		float total_tuition=tuition;
		float sum=0;
		for(int a=1; a<5;a++){
			float new_price=((decimal_percent/100)*total_tuition)+total_tuition;
			sum+=new_price;
		}
		System.out.print(sum);
		
		
		
		
		
		
		input.close();
	}

}
