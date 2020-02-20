package Interest;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class CompoundInterest {
	double calculate() {
		Scanner s=new Scanner(System.in);
		PrintStream output = new PrintStream(new FileOutputStream(FileDescriptor.out));
		output.println("enter principle amount");
		float p=s.nextFloat();
		
		output.println("enter rate of interest");
		int r=s.nextInt();
		
		output.println("time (in years)");
		double t=s.nextFloat();
		
		double amount=p*Math.pow(1+r/100, t);
		s.close();
		output.close();
		return amount;
		
	}
}
