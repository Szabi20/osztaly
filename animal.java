public class animal {
    int numberOfLegs;
    int numberOfEyes;
    String name;

    public void printAnimal(){
        System.out.println(numberOfLegs);
        System.out.println(numberOfEyes);
        System.out.println(name);
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public String getName() {
        return name;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
