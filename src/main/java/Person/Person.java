package Person;

public abstract class Person {
    private String name;
    private int niNumber;

    public Person(String name, int niNumber){
        this.name = name;
        this.niNumber = niNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public int getNiNumber() {
        return niNumber;
    }

    public void setNiNumber(int niNumber) {
        this.niNumber = niNumber;
    }
}
