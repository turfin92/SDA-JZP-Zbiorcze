package pl.sda.ex8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParcelTest {
    @Test
    public void validationShouldNotPassIfOneOfDimensionsIsLessThanLimit(){
        Parcel p1 = new Parcel(31,31, 31, 2, true); //true
        Parcel p2= new Parcel(29,31, 31, 2, true); //false
        Parcel p3 = new Parcel(31,29, 31, 2, true); //false
        Parcel p4 = new Parcel(31,31, 29, 2, true); //false

        ParcelValidator pv = new ParcelValidator();

        assertEquals (true, pv.validate(p1), "All dimensions are ok");
        assertEquals (true, pv.validate(p2), "x length exceeds the limit");
        assertEquals (true, pv.validate(p3), "y length exceeds the limit");
        assertEquals (true, pv.validate(p4), "z length exceeds the limit");
    }
}
