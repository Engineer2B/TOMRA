package sollicitatie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class calculateStatistics{
	public static void main(String[] args) throws IOException {
		/* Process a sequence of integer numbers to
		 * determine the following statistics:
			- minimum value
			- maximum value
			- number of elements in the sequence
			- average value

		For example: [6, 9, 15, -2, 92, 11]
			- minimum value = -2
			- maximum value = 92
			- number of elements in the sequence = 6
			- average value = 21.833333*/
		String strPathProject = System.getProperty("user.dir");
		String strNameFile = args[0];
		//String strNameFile = "1.txt";
		String strPathInput = "input";

		String strArrayRaw = statsFuncs.readFile(strPathProject,strPathInput,strNameFile);
		ArrayList<Double> arlsdoNumbers = statsFuncs.str2array(strArrayRaw);
		
		System.out.print("minimum value = ");
		Collections.sort(arlsdoNumbers);
		System.out.println(arlsdoNumbers.get(0).toString());
		
		System.out.print("maximum value = ");
		System.out.println(arlsdoNumbers.get(arlsdoNumbers.size()-1).toString());
		
		System.out.print("number of elements in the sequence = ");
		System.out.println(Integer.toString(arlsdoNumbers.size()));
		
		System.out.print("average value = ");
		Double doAverage = statsFuncs.calcAverage(arlsdoNumbers);
		System.out.println(doAverage.toString());
	}
}