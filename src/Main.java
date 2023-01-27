public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }
    public static void task1(){
        String firstName = "ivan" ;
      String middleName = "ivanovich" ;
       String lastName = "ivanov" ;
      String fullName =lastName + " " + firstName + " " + middleName ;
        System.out.println("ФИО Сотрудника - " + fullName);
    }
    public static void task2() {
      String fullName = "Ivanov ivan Ivanovich" ;
      String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО Сотрудника для заполения отчета - " + upperFullName);
    }
    public static void  task3() {
         String fullName = "Иванов Семён Семёнович" ;
         String fixedFullName = fullName.replace("ё", "е") ;
        System.out.println("Данные ФИО Сотрудника - " + fixedFullName);
    }
    }
