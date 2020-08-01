package ex5;

import org.junit.jupiter.api.Test;
import pl.sda.ex5.SDAHashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SDAHashSetTest {
    @Test
    public void showcase() {
        //Arrange
        SDAHashSet<Integer> set = new SDAHashSet<>();

        //Act
        set.add(1);
        System.out.println(set.contains(1));
        set.add(2);
        set.remove(1);
        set.clear();

        //Assert
        assertEquals(0, set.size());
        assertTrue(set.isEmpty());
        assertEquals( 6,set.getOperationCounter());
    }
}
