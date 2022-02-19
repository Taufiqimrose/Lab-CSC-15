/* H O M E W O R K   # 8 
 * C S C   1 5
 * 
 * Student's Name Here: Mohammad Taufique Imrose
 * 
 * Follow the directions on the Homework #8 hand out and submit this file via Canvas by the due date.
 * 
 * */

package Main;

public class Homework8{
	public static void main(String[] args){
		  
	       EZFileWrite ezw = new EZFileWrite("testWrite.txt");
	       for (int i = 1; i <= 5; i++) {
	           ezw.writeLine("Test Line #" + i);
	       }
	       ezw.saveFile();
	       EZFileRead ezr = new EZFileRead("testWrite.txt");
	       for (int i = 0; i < ezr.getNumLines(); i++) {
	    	   System.out.println(ezr.getNextLine());
	       }
	       EZFileWrite eza = new EZFileWrite("testWrite2.txt");
	       for (int i = 0; i < ezr.getNumLines(); i++) {
	           eza.writeLine(ezr.getLine(i));
	       }
	   
	       for (int i = 1; i <= 3; i++) {
	           eza.writeLine("Append Line #" + i);
	       }
	       eza.saveFile();
	       EZFileRead ezr2 = new EZFileRead("testWrite2.txt");
	       for (int i = 0; i < ezr2.getNumLines(); i++) {
	    	   System.out.println(ezr2.getLine(i));}
		
	}
	
	public static void p(String out){
		System.out.println(out);
	}
}