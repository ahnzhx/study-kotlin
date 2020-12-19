package kotlinInAction.ch02;

public class Person {
    private String name;
    private boolean isMarried;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, boolean isMarried) {
        this.name = name;
        this.isMarried = isMarried;
    }

    public String getName() {
        return name;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }
}
