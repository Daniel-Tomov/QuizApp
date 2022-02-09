import java.util.ArrayList;
class Quiz {
  static String [] answerKey = {"B","D","C","A","E","A","B","A","E","B"};
  //constructor
  ArrayList<String> answer = new ArrayList<String>();
  public Quiz(ArrayList<String> ans){
    this.answer = ans;
  }

  //accessor method
  public String[] getStudentAns(){
    //String[] studentAns = this.answer.split(" ", this.answer.length;
    /*
    for (int i=0; i < 2; i++){
      System.out.println(this.answer);
      System.out.println("asdf");
    }
    */
    return this.answer;
  }

  

  //totalCorrect method
  public int totalCorrect() {
    int correct = 0;
    for(int i=0; i < this.getStudentAns().length; i++)
    {
      if(this.getStudentAns()[i].equals(answerKey[i]))
        correct++;
    }
    return correct;
  }
  //totalMistakes method
  public int totalMistakes(){
    return 10-totalCorrect();
  }
  //isPassing method
  public void isPassing(){
    if(totalCorrect() >= 7)
      System.out.println("The student PASSED");
    else
      System.out.println("The student FAILED");
  }
  
  //ToString Statement
  @Override
  public String toString(){
    System.out.println("ANSWER KEY" + "\t" + "Student's Answers");
    String [] stuAns = getStudentAns();
     for(int i = 0; i < 10; i++){
      System.out.println((i + 1) + ") "+ answerKey[i] + "\t" + (i + 1) + ") " + stuAns[i]);
    }
    System.out.println("Correct answers: " + this.totalCorrect() + " out of " + answerKey.length);
    return "";
  }

}