import javax.sound.midi.Soundbank;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] questions = new String[]{
                "0. The last thing I do before turning off the lights at night is quickly check if I have received any messages, etc. on my smartphone.",
                "1. The first thing I do when I turn on the lights in the morning is check my smartphone for messages, etc.",
                "2. I have notifications (that make a sound or vibrate) activated on my smartphone.",
                "3. When I notice that a notification has come in on my smartphone, I check my smartphone within a minute to see what it is.",
                "4. While watching a TV series or movie on TV or my computer screen, I use my smartphone one or more times.",
                "5. When I eat alone (breakfast/lunch/dinner), I use my smartphone several times during the meal.",
                "6. When I eat in company—family, friends, etc. (breakfast/lunch/dinner)—I use my smartphone several times during the meal.",
                "7. When I am waiting (for a bus, train, tram, a friend, etc.), I use my smartphone.",
                "8. When walking alone on the street, I do so with my smartphone in my hand and regularly look at the screen.",
                "9. When I'm cycling or driving, I sometimes pick up my smartphone and look at the screen.",
        };
        int counter = 0;
        String[] addictionLevel = new String[]{
                "Not Addicted",
                "Mild",
                "Moderate",
                "Severe",
                "Extreme"
        };
        String[] feedbackMessage = new String[]{
                "You are not digitally addicted. Keep it up!",
                "You have a mild form of digital addiction.",
                "You have a form of digital addiction that should not be underestimated. Set some limits for yourself.",
                "You have a severe form of digital addiction. Consider taking a digital detox course!",
                "You have an extreme form of digital addiction. You probably need professional help!"

        };

        boolean restartSurvey = true;
        String answer = "";
        int counterUser = 0;
        double hours = 0.0;
        double percentage = 0;
        while(restartSurvey) {
            counter = 0;
            String[] userAnswers = new String[10];
            System.out.println("What is your name?");
            String name = sc.nextLine();
            System.out.println("Welcome " + name);
            System.out.println("This survey has already been completed by " + counterUser + " users,");
            System.out.println("Please answer the following questions (Type y if the answer is yes and n if the answer is no.): ");
            for(int i = 0; i < questions.length; i++){
                System.out.println(questions[i]);
                answer = sc.nextLine();
                userAnswers[i] = answer; // ← STORE answer
                if(answer.equalsIgnoreCase("y")){
                    counter++;
                }
            }

            if(counter == 0) {
                System.out.println(addictionLevel[0]);
                System.out.println(feedbackMessage[0]);
            }else if(counter == 1 || counter == 2) {
                System.out.println(addictionLevel[1]);
                System.out.println(feedbackMessage[1]);
            }else if(counter > 2 && counter <= 5) {
                System.out.println(addictionLevel[2]);
                System.out.println(feedbackMessage[2]);
            }else if(counter > 5 && counter < 9) {
                System.out.println(addictionLevel[3]);
                System.out.println(feedbackMessage[3]);
            }else {
                System.out.println(addictionLevel[4]);
                System.out.println(feedbackMessage[4]);
                System.out.println("how many hours a day do you spend on your smartphone");
                hours = sc.nextInt();
                sc.nextLine();
                percentage = hours/24 * 100;
                if(percentage > 80){
                    System.out.println("You spend " + percentage +  "% of the day\n" +
                            "on your smartphone. Your addiction is a danger to yourself and those around you. Seek help as soon as possible!!");
                }else if(percentage < 80 && percentage >= 20){
                    System.out.println("You spend " + percentage +  "% of the day\n" +
                            "on your smartphone. We advise you to seek professional help'");
                }else if(percentage < 20){
                    System.out.println("You spend " + percentage +  "% of the day\n" +
                            "on your smartphone. Strange, are you sure you filled in the survey honestly? Be honest with yourself!");
                }
            }

            System.out.println("Would you like to want to continue another survey? Y or N?");
            String answerToContinueSurvey = sc.nextLine();

            if(answerToContinueSurvey.equalsIgnoreCase("y")) {
                restartSurvey = true;
                counterUser++;
            }else if(answerToContinueSurvey.equalsIgnoreCase("n")) {
                System.out.println("Summary report for user " + name);
                System.out.println("Questions and the answers the user gave");
                for(int i = 0; i < questions.length; i++) {
                    System.out.println(questions[i]);
                    System.out.println("Your answer: " + userAnswers[i]);
                }
                System.out.println("Total number of yes is " + counter);
                if(counter >= 9) { // ← Only show percentage for extreme cases
                    System.out.println("Extreme digital addiction : " + percentage + "%");
                }
                restartSurvey = false;
            }
        }


    }
}