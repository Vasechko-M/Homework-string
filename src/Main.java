public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        System.out.println();
        //task 2
        System.out.println("Задача 2");
        String fullNameUp = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameUp);
        System.out.println();
        //task 3
        System.out.println("Задача 3");
        String fullNameS = "Иванов Семён Семёнович";
        fullNameS = fullNameS.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullNameS);
        System.out.println();
        String expectedFullNameS = "Иванов Семен Семенович";
        if (fullNameS.equals(expectedFullNameS)) {
            System.out.println("Успех.");
        } else {
            System.out.println("Неудача.");
        }
    }
}