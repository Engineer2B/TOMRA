package sollicitatie;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import org.apache.commons.lang3.SystemUtils;

public class statsFuncs{

	public static String readFile(String strPathProject,String strPathInput,String strNameFile){
		// Determine if the system runs on Linux and set the appropriate separator.
		
		String strSeparator = "";
		if( SystemUtils.IS_OS_LINUX ){
			strSeparator = "/";
		}else{
			strSeparator = "\\";
		}
		// Join the path to the .txt files that contains an array of numbers.
		StringJoiner joiner = new StringJoiner(strSeparator);
		joiner.add(strPathProject);
		joiner.add(strPathInput);
		joiner.add(strNameFile);
		String strPathFile = joiner.toString();
		// Initialize a buffered reader that will scan over the file.
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(strPathFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String strLine;
		String strNumbersRaw = "";
		int inCounter = 0;
		try {
			while ((strLine = br.readLine()) != null && inCounter < 2) {
				// Just 1 line is scanned.
				strNumbersRaw = strLine;
				inCounter++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return strNumbersRaw;
	}
	
	public static ArrayList<Double> str2array( String strNumbersRaw ){
		// Strip the '[' and ']' from the string.
		strNumbersRaw = strNumbersRaw.replace("]","");
		strNumbersRaw = strNumbersRaw.replace("[","");
		
		// Split the string into separate strings for each number.
		String[] arstrNumbers = strNumbersRaw.split(",");
		
		ArrayList<Double> arlsdoNumbers = new ArrayList<Double>();
		for (String strNumber : arstrNumbers){
			// Strip empty characters
			String strNumberStripped = strNumber.replace(" ","");
			arlsdoNumbers.add(Double.parseDouble(strNumberStripped));
		}
		return arlsdoNumbers;
	}
	
	public static Double calcAverage( ArrayList<Double> arlsdoInput ){
		/* This function calculates the average of a ArrayList of doubles
		and returns it as a double */
		Double doAverage = 0.0;
		Iterator<Double> itrA = arlsdoInput.iterator();
		while(itrA.hasNext()) {
			// Add each double value to the total
			doAverage += itrA.next();
		}
		// Divide the total by the length of the ArrayList.
		doAverage = doAverage / arlsdoInput.size();
		return doAverage;
	}
}