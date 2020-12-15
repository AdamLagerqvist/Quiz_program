import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        String question = "";
        double Svar = (int) (Math.random() * 10 + 1);
        int Svar1 = (int) Svar;
        int R_quest1 = (int) (Math.random() * 6 + 1);
        int R_quest2 = (int) (Math.random() * 6 + 1);
        int R_quest3 = (int) (Math.random() * 6 + 1);
        int i = 0;
        int count = 0;
        int[] nummer = new int[3];
        while (i < 3){
            nummer[i] = (int) (Math.random() * 10 +1);
            i++;
        }
        // System.out.println(R_quest);
        if (R_quest1 == 1 || R_quest2 == 1 || R_quest3 == 1) {
            int yes = (int) (Math.random() * 2 + 2);
            question = "" + question + "^" + yes;
            Svar = Math.pow(Svar,yes);
        } if(R_quest1 == 2 || R_quest2 == 2 || R_quest3 == 2){
            question = "" + question + " * " + nummer[count];
            Svar *= nummer[count];
            count++;
        } if(R_quest1 == 3 || R_quest2 == 3 || R_quest3 == 3){
            question = "" + question + " / " + nummer[count];
            Svar = Svar / nummer[count];
            count++;
        } if(R_quest1 == 4 || R_quest2 == 4 || R_quest3 == 4){
            question = "" + question + " + " + nummer[count];
            Svar += nummer[count];
            count++;
        } if(R_quest1 == 5 || R_quest2 == 5 || R_quest3 == 5){
            question = "" + question + " - " + nummer[count];
            Svar -= nummer[count];
            count++;
        }
        question = Svar1 + "" + question;
        if(R_quest1 == 6 || R_quest2 == 6 || R_quest3 == 6){
            int temp = nummer[count] * 10;
            question ="" + temp + " procent av ( " + question + " )";
            Svar = (double) nummer[count] / 10 * Svar;
        }
        question = "Vad är " + question + "\n\nAvrunda till närmaste heltal\n";
        System.out.println(question);
        Scanner tgb = new Scanner(System.in);
        if (tgb.nextInt() == Math.round(Svar)){
            System.out.println("\nCorrect svaret var " + Math.round(Svar));
        }else{
            System.out.println("\n\nIncorrect svaret var " + Math.round(Svar));
        }
    }
}
