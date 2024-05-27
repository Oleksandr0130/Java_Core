package lesson_16.ClassWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static List<Employee> selectEmployeeForBonus(List<Employee> list, int N){
        List<Employee> result = new ArrayList<>();
        List<Employee> sortedList = sort(list,new ComparatorEmployeeByYear());
        int i = 0;
        int year = 0;
        for ( i = 0; i < Math.min(N,sortedList.size()); i++) {
            Employee emp = sortedList.get(i);
            result.add(emp);
            year = emp.getYear();
        }
        for (; i < sortedList.size(); i++){
            Employee employee = sortedList.get(i);
            if (employee.getYear() == year){
                result.add(employee);
            }else {
                break;
            }
        }
//        if (i < sortedList.size()){
//        Employee employee =  sortedList.get(i);
//            while (employee.getYear() == year){
//                result.add(employee);
//                i++;
//                if (i >= sortedList.size()){
//                    break;
//                }
//                employee = list.get(i);
//            }
//        }
        return result;
    }
    public static List<Employee> sort(List<Employee> list, Comparator<Employee> comparator){
        ArrayList<Employee> sortedEmployees = new ArrayList<>(list);
        Collections.sort(sortedEmployees,comparator);
        return sortedEmployees;
    }

}
