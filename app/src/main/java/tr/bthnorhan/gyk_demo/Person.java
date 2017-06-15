package tr.bthnorhan.gyk_demo;

/**
 * Created by bthnorhan on 13.06.2017.
 */

public class Person {
    String name;
    boolean isWoman;

    public Person(String name, boolean isWoman) {
        this.name = name;
        this.isWoman = isWoman;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWoman() {
        return isWoman;
    }

    public void setWoman(boolean woman) {
        isWoman = woman;
    }
}
