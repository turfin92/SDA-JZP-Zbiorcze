package pl.sda.ex8;

public interface Validator {
    boolean validate(Parcel p) {
        if (p.getxLength() + p.getyLength() + p.getzLength() > 300) {
            System.out.println("Sum of lengths is over the limit of 300");
            return false;

        }
        if (p.getxLength() < 30 || p.getyLength() < 30 || p.getzLength() < 30) {
            System.out.println("One of dimension is less than 30");
            return false;

        }
        if (p.isExpress()) {
            if (p.getWeight() > 15) {
                System.out.println("Weight exceeds 15 and is under 30");
                return false;
            } else {
                if (p.getWeight() > 30) {
                    System.out.println("Weight exceeds 30");
                    return false;

                }
            }
            return true;

        }
    }
}

