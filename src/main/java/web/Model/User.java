package web.Model;



public class User {
    private int id;
//    @NotEmpty(message = "Name cant be empty")
//    @Size(min = 1, max = 55, message = "name mast be 1 or longer or 55 or shorter")
    private String name;
//    @NotEmpty(message = "cant be Emtpty lastName")
    private String lastName;
//    @NotEmpty (message = "age cant be empty")
//    @Min(value = 0, message = "age must be longer, then 0")
    private int age;

    public User(){

    }

    public User(int id, String name, String lastName, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
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
    public String getLastName(){
        return lastName;
    }
    public void setLastName(){
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
