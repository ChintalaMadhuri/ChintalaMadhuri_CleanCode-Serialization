package Interest;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class SimpleInterest {
	float calculate() {
		Scanner s=new Scanner(System.in);
		PrintStream output = new PrintStream(new FileOutputStream(FileDescriptor.out));
		output.println("enter principle amount");
		float p=s.nextFloat();
		
		output.println("enter rate of interest");
		int r=s.nextInt();
		
		output.println("time (in years)");
		float t=s.nextFloat();
		
		float amount=p*t*r/100;
		s.close();
		output.close();
		return amount;
	}
}
