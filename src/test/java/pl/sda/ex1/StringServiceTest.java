package pl.sda.ex1;

import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringServiceTest {
    @Test
    public void testGetSortedAlphabeticallyZACaseInsesitive() {
        List<String> listUnsorted = getUnsortedStrings();

        StringService ss = new StringService();
        List<String> listSorted = new ArrayList<>();

        listSorted = ss.getSortedAlphabeticallyZA(listUnsorted);
        System.out.println(listSorted);

        List<String> manuallylistSorted = Arrays.asList("za", "ab", "aa", "aB", "Ab");

        assertEquals(manuallylistSorted, listSorted );
    }

    private List<String> getUnsortedStrings() {
        List<String> listUnsorted = new ArrayList<>();
        listUnsorted.add ("aa");
        listUnsorted.add ("ab");
        listUnsorted.add ("Ab");
        listUnsorted.add ("za");
        listUnsorted.add ("aB");
        return listUnsorted;
    }
}
