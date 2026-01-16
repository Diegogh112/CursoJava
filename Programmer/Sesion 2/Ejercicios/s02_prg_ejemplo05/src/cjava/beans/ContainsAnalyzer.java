package cjava.beans;

/**
 *
 * @author emaravi
 */
public class ContainsAnalyzer implements StringAnalizer{

    @Override
    public boolean analize(String o, String d) {
        return o.contains(d);
    }
    
}
