public class Quiz {
    private String questions = "Why do we use methods?";

    public String getQuestions(){
        return questions;
    }

    private int answer = 2;

    public int getCorrectAnswer(){
        return answer;
    }

    private String option1 = "To repeat a statement multiple lines.";
    private String option2 = "To decompose a program into several small subroutine.";
    private String option3 = "To determine the execution time of a program.";
    private String option4 = "To iterrupt the exectuion of a program.";

    public void printOptions(){
        System.out.println("1. "+ option1);
        System.out.println("2. "+ option2);
        System.out.println("3. "+ option3);
        System.out.println("4. "+ option4);
    }

}
