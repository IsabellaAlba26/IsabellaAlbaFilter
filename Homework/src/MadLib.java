public class MadLib {

    //main method
    public static void main(String [] args) {
        //System.out.println("Hello World");
        MadLib myStory = new MadLib();
    }

    //constructor method
    public MadLib() {
       // System.out.println("Hello World");
         String classmate = "Bob";
         String city = "Miami";
         String noun = "lego";
         String adjective = "shiny";
         String pluralNoun = "books";
         String pluralAnimal = "turtles";
         boolean trueOrFalse = true;
         double decimalBiggerThan1 = 1.7;
         int firstNumber = 7;
         int secondNumber = 9;
         int wholeNumberBetween1And4 = 3;
         String miltonTeacher = "Mr.Q";
         String miltonDean = "Ms.Sugrue";
         char letterGrade = 'A';
         String season = "winter";
         String Class = "English";
         int NumberofDays = 1000;
         int NumberofSeconds = 2;

        //define a string(s) called story (in this case storySent#) for mad lib
        String storySent1 = "This weekend I am going camping with " + classmate + ".";
        String storySent2 ="We are going to a campsite in " + city + ".";
        String storySent3 = "I packed my " + noun + " and " + pluralNoun + ".";
        String storySent4 = "The forecast is calling for a high of " + decimalBiggerThan1 + " degrees fahrenheit.";
        String storySent5 = "So it should be a " + adjective + " day!";
        String storySent6 = "This year, the park rangers have seen " + firstNumber + " " + pluralAnimal + ", which seems kind of dangerous. ";
        String storySent7 = "" + miltonTeacher + " said it's " + trueOrFalse + " that " + pluralAnimal + " eat class " + wholeNumberBetween1And4 + " students in the " + season + ".";
        String storySent8 = "But, " + miltonDean + " said it actually has only happened " + secondNumber + " times.";
        String storySent9 = "Wish us luck! If we survive, we will earn a " + letterGrade + "+ in P.E. class.";
        String storySent10 = "If only we could earn that grade in " + Class + "! What a miracle that would be!";
        String storySent11 = "Bob wants to spend " + NumberofDays + " days at the campground, but I'd rather spend " + NumberofSeconds + " seconds here!";

        //prints story to das window
        System.out.println(storySent1);
        System.out.println(storySent2);
        System.out.println(storySent3);
        System.out.println(storySent4);
        System.out.println(storySent5);
        System.out.println(storySent6);
        System.out.println(storySent7);
        System.out.println(storySent8);
        System.out.println(storySent9);
        System.out.println(storySent10);
        System.out.println(storySent11);
    }
}

