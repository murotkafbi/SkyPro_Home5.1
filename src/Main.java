import java.time.LocalDate;

public class Main {
    class Scratch {

        public static void main(String[] args) {
            task1();
            task2();
            task3();
            task4();
            task5();


        }

        public static void task1() {
            String firstName = "ivan";
            String middleName = "ivanovich";
            String lastName = "ivanov";
            String fullName = lastName + " " + firstName + " " + middleName;
            System.out.println("ФИО Сотрудника - " + fullName);
        }

        public static void task2() {
            String fullName = "Ivanov ivan Ivanovich";
            String upperFullName = fullName.toUpperCase();
            System.out.println("Данные ФИО Сотрудника для заполения отчета - " + upperFullName);
        }

        public static void task3() {
            String fullName = "Иванов Семён Семёнович";
            String fixedFullName = fullName.replace("ё", "е");
            System.out.println("Данные ФИО Сотрудника - " + fixedFullName);
        }

        public static void task4() {

            int year = 2020;
            printInfoAboutYear(year);

        }

        private static void printInfoAboutYear(int yaer) {
            boolean leapYear = isLeapYear(yaer);

            if (leapYear) {
                System.out.println(yaer + " год является високосным");

            } else {
                System.out.println(yaer + " год является високосным");
            }

        }

        private static boolean isLeapYear(int year) {
            return year % 4 == 0 && year % 100 != 0 || year % 400 ==0;

            }
            public static void task5() {

            }
            private static void  printInfoAboutVersion(int os,
                int productionYear){
            if (os < 0  || os >1){
                System.out.println("OC должна бытьь равна 0 или 1!");
                }
                int currentYear = LocalDate.now().getYear();
            StringBuilder result = new StringBuilder("Утсановите ") ;
            if (productionYear < currentYear) {
                result.append("облегченную версию для ");
            }else {
                result.append("версию для");
            }
            if (os==0){
                result.append("iso");
            }else {
                result.append("Android");
            }
                System.out.println(result);
            }


        }
    }
