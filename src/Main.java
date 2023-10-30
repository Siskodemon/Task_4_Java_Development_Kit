import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
     List_Employees list_emp = new List_Employees();
        list_emp.add(new Employee(2341,4,89146581289L, "Александр"));
        list_emp.add(new Employee(2331,1,89144183299L, "Генадий"));
        list_emp.add(new Employee(2321,10,89995617834L, "Владимир"));
        list_emp.add(new Employee(2891,3,89617823412L, "Елезавета"));
        list_emp.add(new Employee(2111,7,89241239081L, "Александр"));

        Set_border(1,list_emp);
        Set_border(2,list_emp);
        Set_border(3,list_emp);
        Set_border(4,list_emp);

    }
    public static void Set_border(int number,List_Employees list_employees){
        System.out.println("============(Пункт №"+number+")==============");
        switch (number){
            case (1):
                System.out.println(list_employees.employee_Experience(-1,5));
                break;
            case (2):
                System.out.println(list_employees.employee_phone_by_name("Александр"));
                break;
            case (3):
                System.out.println(list_employees.employee_by_persNum(2111));
                break;
            case (4):
                list_employees.add(new Employee(2118,2,89243412222L, "Дмитрий"));
                System.out.println("Сотрудник добавлен в справочник.");
                break;
        }
        System.out.println("====================================\n");
    }
}