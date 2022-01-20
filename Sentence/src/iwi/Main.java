package iwi;

public class Main {
    public static void main(String[] args) {
        Sentence s = new Sentence("Winke winke guten Morgen!");

        for(int i = 0; i < s.getWords().length; ++i){
            System.out.println(s.getWords()[i]);
        }
    }
}
