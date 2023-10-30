import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.LinkedList;

public class List_Employees {
    private ArrayList<Employee> list_employees = new ArrayList<>();

    //Поиск по стажу
    public String employee_Experience(int comparison, int value){
        String result="";
        if (comparison < 0){
            for (int i = 0; i < list_employees.size(); i++) {
                if (list_employees.get(i).getExperience()<value) result+=list_employees.get(i).getName()+" ";
            }
        } else if (comparison == 0) {
                for (int i = 0; i < list_employees.size(); i++) {
                    if (list_employees.get(i).getExperience() == value) result+=list_employees.get(i).getName()+" ";
                }
        } else if (comparison > 0) {
                for (int i = 0; i < list_employees.size(); i++) {
                    if (list_employees.get(i).getExperience()>value) result+=list_employees.get(i).getName()+" ";
                }
        }
        return result;
    }

    //Поиск номера телефона сотрудника по имени;
    public String employee_phone_by_name(String name){
        String result="";
        Employee buff = new Employee();
        Iterator<Employee> iterator = list_employees.iterator();
        while (iterator.hasNext()) {
            buff = iterator.next();
            if (name.equals(buff.getName())) result = result + String.valueOf(buff.getPhone_Number()) + " ";
        }
       return result;
    }

    //Поиск сотрудника по табельному номеру;
    public String employee_by_persNum(int persNum){
        String result="";
        Employee buff = new Employee();
        Iterator<Employee> iterator = list_employees.iterator();
        while (iterator.hasNext()){
            buff = iterator.next();
            if (persNum == (buff.getPersonnel_Number())) return buff.toString();
        }
        if (result.equals(""))
        return "Сотрудник с таким именем отсутствует в справочнике!";
        else return result;
    }

    //Метод добавления сотрудника
    public void add(Employee employee){
        this.list_employees.add(employee);
    }

    public List_Employees() {

    }
}
