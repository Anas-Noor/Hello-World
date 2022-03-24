public class Licience {
    String name="421010028";
    int unit=18;

    public Licience(){

    }

    @Override
    public String toString() {
        return "Licience{" +
                "name='" + name + '\'' +
                ", unit=" + unit +
                '}';
    }

    public Licience(String name, int unit) {
        this.name = name;
        this.unit = unit;
    }
}
