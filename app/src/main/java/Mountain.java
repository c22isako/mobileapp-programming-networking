
public class Mountain {

    private String name;
    private String location;
    private int height;

    public Mountain(String name,String location,int height) {

        name = "no name";
        location = "no location";
        height = -1;

    }
    public Mountain(String name) {

        name = "no name";
        location = "no location";
        height = 0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "name='" + name + '\'' +
                '}';
    }

}
