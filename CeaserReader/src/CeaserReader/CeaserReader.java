package CeaserReader;

import java.io.*;

public class CeaserReader extends FilterReader {
    protected int key;
    public CeaserReader(Reader in, int key)  {
        super(in);
        this.key = key;
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        if (c < 0 ){
            return c;
        }
        return c - key;
    }
}
