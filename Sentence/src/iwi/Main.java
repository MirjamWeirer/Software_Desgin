package iwi;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Sentence s = new Sentence("Winke winke guten Morgen!");

        for(int i = 0; i < s.getWords().length; ++i){
            System.out.println(s.getWords()[i]);
        }
        System.out.println("---------");
        for (String w : s){
            System.out.println(w);
        }

        //geht auch - nicht notwendig
        Iterator<String> it = s.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
