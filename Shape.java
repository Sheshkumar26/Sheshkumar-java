public class Dog {
    private String name;
    
    public Dog(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

public class Labrador extends Dog {

public void setColor(String color) {
    this.color = color;
}

public void setLanguage(String language) {
    this.language = language;
}
