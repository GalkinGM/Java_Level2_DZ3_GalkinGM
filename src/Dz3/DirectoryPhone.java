package Dz3;
import java.util.*;


public class DirectoryPhone {

    private HashMap<String, List<String>> Directory;

    public DirectoryPhone(){
        this.Directory = new HashMap<>();
    }

    public void add(String surname, String number){
        if(Directory.containsKey(surname)){
            List<String> numbers = Directory.get(surname);
            if(!numbers.contains(number)){
                numbers.add(number);
                System.out.println(String.format("Дополнительный номер %s добавлен контакту %s", number, surname));
            } else {
                System.out.println(String.format("Номер %s уже существует, принадлежит контакту %s", number, surname));
            }
        } else {
            Directory.put(surname, new ArrayList<>(Arrays.asList(number)));
            System.out.println("Новый контакт создан");
        }
    }

    public List<String> get(String surname){
        if(Directory.containsKey(surname)){
            return Directory.get(surname);
        } else {
            System.out.println(String.format("В справочнике нет контакта по фамилии %s", surname));
            return null;
        }
    }
}


