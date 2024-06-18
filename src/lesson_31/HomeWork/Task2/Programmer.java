package lesson_31.HomeWork.Task2;
/*
Допустим, у вас в программе есть класс Programmer.
Кроме имени у него есть поле String status; и этот статус может иметь значение «доступен» «занят» и «не доступен».
Вам необходимо реализовать метод String doWork(String taskMsg) который в качестве результата,
либо возвращает строку stringMsg большими буквами, либо кидает ProgrammerBusyException (статус “занят”),
либо ProgrammerUnavailableNowException (статус “недоступен”) в зависимости от текущего состояния программера.
В Main необходимо либо, выводить результат работы либо обработать Exception и вывести сообщение «Программист занят другой задачей» или «Программист не доступен»

 */

import lesson_31.HomeWork.Task2.Exceptions.ProgrammerBusyException;
import lesson_31.HomeWork.Task2.Exceptions.ProgrammerUnavailableNowException;

public class Programmer {
    private String name;
    private String status;

    public Programmer(String name, String status) {
        this.name = name;
        this.status = status;
    }
    public String doWork(String taskMsg) throws ProgrammerBusyException, ProgrammerUnavailableNowException {
        if ("занят".equals(status)){
            throw new ProgrammerBusyException();
        } else if ("не доступен".equals(status)) {
            throw new ProgrammerUnavailableNowException();
        }else {
            return taskMsg.toUpperCase();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
