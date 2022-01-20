package iwi;

import java.util.Iterator;

public class Sentence implements Iterable<String>{
    private String[] words;

    //text contanis a whole sentence
    public Sentence(String text){
        words = text.split(" ");
    }

    public String[] getWords() {
        return words;
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }
}
