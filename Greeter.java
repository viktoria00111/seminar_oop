package Work3;
//Здесь присвоение "formality" убрал в отдельный класс
public class Greeter extends HowSey{
    private String formality;

    public String greet() {
        switch (this.formality) {
            case "formal":
                return "Good evening, sir.";
            case "casual":
                return "Sup bro?";
            case "intimate":
                return "Hello Darling!";
            default:
                return "Hello.";
        }
    }

    
}
