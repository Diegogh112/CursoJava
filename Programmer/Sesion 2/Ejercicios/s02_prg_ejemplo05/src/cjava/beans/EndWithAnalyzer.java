package cjava.beans;

public class EndWithAnalyzer implements StringAnalizer{

    @Override
    public boolean analize(String o, String d) {
        return o.endsWith(d);
    }
}
