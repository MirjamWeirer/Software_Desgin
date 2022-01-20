package iwi;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SentenceIterator implements Iterator<String> {
    private String[] words;
    private  int position = 0;

    public SentenceIterator(String[] words){
        this.words = words;
    }

    @Override
    public boolean hasNext() {
        return words.length > position;
    }

    @Override
    public String next() {
        if (hasNext()){
            return words[position++];
        }
        throw new NoSuchElementException("There are no more words");
    }
}
