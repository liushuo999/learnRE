package annotation;

@annoTable("tb_stu")
public class Student {
    @annoField(columnname = "id",type = "int",length = 10)
    private int id;
    @annoField(columnname = "age",type = "int",length = 5)
    private int age;
    @annoField(columnname = "stuname",type = "varchar",length = 10)
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
