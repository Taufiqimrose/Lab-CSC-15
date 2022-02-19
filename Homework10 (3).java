 // H O M E W O R K   # 1 0 
// C S C   1 5
// Student's Name Here: Mohammad Taufique Imrose 

package Main;

import java.util.StringTokenizer;

public class Homework10 {

public static void main(String[] args) {

// My code to dynamically make a text file (DO NOT MODIFY OR REMOVE!)
	EZFileWrite efw = new EZFileWrite("parse.txt");
	efw.writeLine("Shawshank Redemption*1994*Tim Robbins*2.36");
	efw.writeLine("The Godfather*1972*Al Pacino*2.92");
	efw.writeLine("Raging Bull*1980*Robert De Niro*2.15");
	efw.writeLine("Million Dollar Baby*2004*Hilary Swank*2.2");
	efw.writeLine("Straight Outta Compton*2015*Jason Mitchell*2.45");
	efw.saveFile();
// End of test

// TODO: Write code to load the text file into memory, parse it, and display the data in a meaningful way...

// (Use the instructions in the hand out to complete the assignment for full credit)

EZFileRead efr = new EZFileRead("parse.txt");
int efrLength = efr.getNumLines();
String[] movies = new String[efrLength];
int[] years = new int[efrLength];
String[] stars = new String[efrLength];
float[] runtimes = new float[efrLength];
for (int index = 0; index < efrLength; ++index) {
String raw = efr.getLine(index);
StringTokenizer st = new StringTokenizer(raw, "*");
movies[index] = st.nextToken();
years[index] = Integer.parseInt(st.nextToken());
stars[index] = st.nextToken();
runtimes[index] = Float.parseFloat(st.nextToken());
}

printStringArrayWithHeader("MOVIES", movies);
printIntArrayWithHeader("YEARS", years);
printStringArrayWithHeader("STARS", stars);
printFloatArrayWithHeader("RUNTIMES", runtimes);

}
private static void printStringArrayWithHeader(String headerName, String[] stringArray) {
printHeaderName(headerName);
for (int index = 0; index < stringArray.length; ++index) {
System.out.println(stringArray[index]);
}
}
private static void printIntArrayWithHeader(String headerName, int[] intArray) {
printHeaderName(headerName);
for (int index = 0; index < intArray.length; ++index) {
System.out.println(intArray[index]);
}
}
private static void printFloatArrayWithHeader(String headerName, float[] floatArray) {
printHeaderName(headerName);
for (int index = 0; index < floatArray.length; ++index) {
System.out.println(floatArray[index]);
}
}
private static void printHeaderName(String headerName) {
System.out.println("-----" + headerName + "-----");
}
}