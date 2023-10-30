public class Employee {
    private int personnel_Number;
    private int experience;
    private long phone_Number;
    private String name;

    public Employee(){

    }
    public Employee(int personnel_Number, int experience, long phone_Number, String name) {
        this.personnel_Number = personnel_Number;
        this.experience = experience;
        this.phone_Number = phone_Number;
        this.name = name;
    }

    public int getPersonnel_Number() {
        return personnel_Number;
    }

    public int getExperience() {
        return experience;
    }

    public long getPhone_Number() {
        return phone_Number;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Сотрудник{" +
                "табельный номер=" + personnel_Number +
                ", стаж=" + experience +
                ", номер телефона=" + phone_Number +
                ", имя='" + name + '\'' +
                '}';
    }
}
