package src.Declarative;

public class person {
    private int age;
    private String f_name;
    private String l_name;
    private gender gender;

    public person(int age, String f_name, String l_name,gender gender) {
        this.age = age;
        this.f_name = f_name;
        this.l_name = l_name;
        this.gender = gender;
    }

    public person() {
    }

    public int getAge() {
        return age;
    }

    public String getF_name() {
        return f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "person{" +
                "age="+age+"," +
                "gender="+gender+","+
                "first name="+f_name+ ","+
                "last name="+l_name+
                '}';
    }
}
