package higorn.practice;

import com.sun.jmx.remote.internal.ArrayQueue;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;
import org.junit.Test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by higor on 23/05/18.
 */
public class BinaryGapTest {
    @Test
    public void case1() {
        String str = Integer.toBinaryString(1041);
        System.out.println(str);
        Pattern pattern = Pattern.compile("([0]+)1");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()) {
            System.out.println(matcher.group(1));
//            matcher.group();
        }
    }
}
