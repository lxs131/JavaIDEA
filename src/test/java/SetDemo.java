import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

    private Set<Integer> set = new HashSet<>();

    @BeforeAll
    public void setup() {
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(3);
    }

    //foreach
    @Test
    public void test02() {
        for(Integer e: set) {
            System.out.println(e);
        }
    }

    //使用迭代器
    @Test
    public void test03() {
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
