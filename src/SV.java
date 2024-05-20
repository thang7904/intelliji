public class SV {
    private int id;
    private String name;
    private int age;

    public SV(int id, String name, int age) {
        this.id = id;
        try {
            if (name.isEmpty()) {
                this.name = " ";
                throw new NameException("Name cannot be empty");
            }
            else{
                this.name = name;
            }
        }
        catch (NameException e) {
            System.out.println(e.getMessage());
        }

        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                id +
                " | " + name +
                        " | " + age
                ;
    }
}
