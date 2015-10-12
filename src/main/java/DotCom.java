import java.io.Serializable;

public class DotCom implements Serializable {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public DotCom() {
        setName("super class");
    }

    private final String myFinal() {
        return "i am final";
    }
}
