package hw;

public class SecondTask {
    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();

        phonebook.add("Иванов", "89213736655");
        phonebook.add("Иванов", "+79115556655");
        phonebook.add("Иванов", "+74954433221");
        phonebook.add("Сидоров", "89115222334");
        phonebook.add("Петров", "89064422114");

        phonebook.get("Иванов");
        phonebook.get("Сидоров");
        phonebook.get("Петров");
    }
}