public class BirthOfBot {
    private String botName;
    private int birthOfBot;

    public BirthOfBot(String botName, int birthOfBot) {
        this.botName = botName;
        this.birthOfBot = birthOfBot;
    }

    public String getBotName(){
        return this.botName;
    }

    public int getBirthOfBot(){
        return this.birthOfBot;
    }
}
