import java.util.Scanner;
import java.util.ArrayList;
class Main 
{
  public static void main(String[] args) 
  {
    ArrayList<String> stuAns = new ArrayList<String>();;
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < 10; i++){
      System.out.println("Enter your answers: ");
      stuAns.add(scan.nextLine());
    }
    Quiz q = new Quiz(stuAns);
    q.toString();
    System.out.println(q.totalCorrect());
  }
}