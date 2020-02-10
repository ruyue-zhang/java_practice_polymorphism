public class Application {
    public static void main(String[] args) {
        Windows intellijIdea = new IntellijIdea();
        intellijIdea.responsePressF5();
        Windows chrome = new Chrome();
        chrome.responsePressF5();
    }
}
