import java.util.*; 
public class Player {

  // private properties
  private String Name;
  private Integer Overall;
  private Integer Pace;
  private Integer Shooting;
  private Integer Passing;
  private Integer Dribbling;
  private Integer Defending;
  private Integer Physical;
  
  // Default Constructor
  public Player() {
    Name = "";
    Overall = 0;
    Pace = 0;
    Shooting = 0;
    Passing = 0;
    Dribbling = 0;
    Defending = 0;
    Physical = 0;
  }
  
  // Constructor to Create Player
  public Player (String _name, Integer _overall, Integer _pace, Integer _shooting, Integer _passing, Integer _dribbling, Integer _defending, Integer _physical) {
    Name = _name;
    Overall = _overall;
    Pace = _pace;
    Shooting = _shooting;
    Passing = _passing;
    Dribbling = _dribbling;
    Defending = _defending;
    Physical = _physical;
  }
  
  // public methods
  public void printStats() {
    System.out.println("Name: " + Name +" Overall: " + Overall +" Pace: " + Pace +" Shooting: " + Shooting +" Passing: " + Passing +" Dribbling: " + Dribbling +" Defending: " + Defending +" Physical: " + Physical);
  }
}