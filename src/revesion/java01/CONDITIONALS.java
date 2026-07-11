package revesion.java01;

public class CONDITIONALS {
    static void main(String[] args) {
        //IF STATEMENT
        int dailyPractise = 12;
        if(dailyPractise >= 10){
            System.out.println("Good consistency");
            int age = 10;
           // if(age<18){
               // System.out.println("You are eligible to vote");
            }
            // if else
            int age = 12;
            if(age>=18){
                System.out.println("You are eligible to vote");
            }else{
                System.out.println("Not eligible to vote");
            }
            // if else if ladder (use for multiple condition checking)
          int accuracy = 78;
            if (accuracy >=90){
                System.out.println("Excellent");
            }
            else if (accuracy >= 75){
                System.out.println("good");
            }
            else if (accuracy >= 60){
                System.out.println("Average");
            }
            else{
                System.out.println("Needs improvement");
            }
            // nested if else
            boolean hasSubscription = true;
            int solvedProblems = 10;
            if (hasSubscription){
                if(solvedProblems >= 200){
                    System.out.println("Unlock Advancesheet");
                }else{
                    System.out.println("Practise More problems");
                }
            }else{
                System.out.println("Upgrade to premium");
            }
            //TERNIARY OPERATOR
        int streakDays = 35;
            String status = (streakDays >= 30) ? "consistent" : "Irregular";
        System.out.println(status);

        // SWITCH
         int day = 4;
         switch(day){
        case 1:
        System.out.println("Monday");
        break;
             case 2:
                 System.out.println("Tuesday");
                 break;

             case 3:
                 System.out.println("thrusday");
                 break;
             case 4:
                 System.out.println("friay");
                 break;
             case 5:
                 System.out.println("saturday");
                 break;
             case 6:
                 System.out.println("sunday");
                 break;


         }
    }}

