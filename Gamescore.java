/* H O M E W O R K   # 7 
 * C S C   1 5
 * 
 * Student's Name Here: Mohammad Taufique Imrose
 * 
 * Follow the directions on the Homework #7 hand out and submit this file via Canvas by the due date.
 * 
 * */

package Main;

public class Gamescore{
	 
    private int Points;
    
    public Gamescore(int startScore) {
        this.Points = startScore;
    }
    
    public int getScore() {
        return Points;
    }
    
    public void setScore(int score) {
        this.Points = score;
    }
 
    public void increaseScore(int amt){
        this.setScore(this.getScore()+amt);
    }
    
    public void decreaseScore(int amt){
        this.setScore(this.getScore()-amt);
    }
  
    public void resetScore(){
        this.setScore(0);
    }
  
    public String toString() {
        return "Score: " +Points;}
	
}