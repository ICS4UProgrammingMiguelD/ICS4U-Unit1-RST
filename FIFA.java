import java.util.*; 
import java.io.*;
import java.util.Random;
/**.
* CPT

* @author  Miguel Duarte
* @version 1.0
* @since   2020-11-11
*/
public class FIFA {
  public static void main(String[] args) {
    
    // Create scanner
    Scanner userInput = new Scanner(System.in);
    
    // Declare variable
    String userChoose;
    
    // Ask the user if they want to open a pack
    System.out.print("Would you like to open a FIFA pack?: ");
    
    // Convert userChoose to
    userChoose = userInput.next();
    
    while (userChoose.equals("Yes")) {
      
      try {
      // Players List
      File playersObj =  new File("Players.txt");
      Scanner playerScanner = new Scanner(playersObj);
      ArrayList<String> players = new ArrayList<String>();
      while (playerScanner.hasNextLine() == true) {
        players.add(playerScanner.nextLine());
      }
      playerScanner.close();
      
      // Overall List
      File overallObj =  new File("Overall.txt");
      Scanner overallScanner = new Scanner(overallObj);
      ArrayList<Integer> overall = new ArrayList<Integer>();
      while (overallScanner.hasNextInt() == true) {
        overall.add(overallScanner.nextInt());
      }
      overallScanner.close();
      
      // Pace List
      File paceObj =  new File("Pace.txt");
      Scanner paceScanner = new Scanner(paceObj);
      ArrayList<Integer> pace = new ArrayList<Integer>();
      while (paceScanner.hasNextInt() == true) {
        pace.add(paceScanner.nextInt());
      }
      paceScanner.close();
      
      // Shooting List
      File shootingObj =  new File("Shooting.txt");
      Scanner shootingScanner = new Scanner(shootingObj);
      ArrayList<Integer> shooting = new ArrayList<Integer>();
      while (shootingScanner.hasNextInt() == true) {
        shooting.add(shootingScanner.nextInt());
      }
      shootingScanner.close();
      
      // Passing List
      File passingObj =  new File("Passing.txt");
      Scanner passingScanner = new Scanner(passingObj);
      ArrayList<Integer> passing = new ArrayList<Integer>();
      while (passingScanner.hasNextInt() == true) {
        passing.add(passingScanner.nextInt());
      }
      passingScanner.close();
      
      // Dribbling List
      File dribblingObj =  new File("Dribbling.txt");
      Scanner dribblingScanner = new Scanner(dribblingObj);
      ArrayList<Integer> dribbling = new ArrayList<Integer>();
      while (dribblingScanner.hasNextInt() == true) {
        dribbling.add(dribblingScanner.nextInt());
      }
      dribblingScanner.close();
      
      // Defending List
      File defendingObj =  new File("Defending.txt");
      Scanner defendingScanner = new Scanner(defendingObj);
      ArrayList<Integer> defending = new ArrayList<Integer>();
      while (defendingScanner.hasNextInt() == true) {
        defending.add(defendingScanner.nextInt());
      }
      defendingScanner.close();
      
      // Physical List
      File physicalObj =  new File("Physical.txt");
      Scanner physicalScanner = new Scanner(physicalObj);
      ArrayList<Integer> physical = new ArrayList<Integer>();
      while (physicalScanner.hasNextInt() == true) {
        physical.add(physicalScanner.nextInt());
      }
      physicalScanner.close();
      
      // Generate the random number
       Random rand = new Random();
      
      // Obtain a number between [0 - 8].
      int computerNumber = rand.nextInt(8);
      
      // create an empty list of players
      ArrayList <Player> listOfPlayers = new ArrayList<Player>();
      
      for (int i = 0; i < players.size(); i++) {
        // create a player with the information provided
        Player aPlayer = new Player (players.get(i), overall.get(i), pace.get(i), shooting.get(i), passing.get(i), dribbling.get(i), defending.get(i), physical.get(i));
        // add the player to the list
        listOfPlayers.add(aPlayer);
      }
      
      // Select the player based on the random number
      listOfPlayers.get(computerNumber).printStats();
      
      // Ask the user if they want to open a pack
      System.out.print("Would you like to open a FIFA pack?: ");
      
      // Convert userChoose to
      userChoose = userInput.next();
    }
    catch (Exception e) {
      System.out.println("An error occurred.");
      }
    } 
    if (userChoose.equals("No")) {
      System.out.println("Enjoy your players!");
    }
  }
}