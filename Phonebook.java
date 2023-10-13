package fonebook;

import java.util.*;

public class Phonebook {

    private Map<String, List<String>> phonebook;


    public void add(String name, String phoneNumber){
        if (phonebook.containsKey(name)) {
            List <String> numbers = phonebook.get(name);
            numbers.add(phoneNumber);
           // phonebook.put(name, new ArrayList<>());
        }
            List<String> phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            phonebook.put(name, phoneNumbers);

       // phonebook.get(name).add(phoneNumber);
    }

    public void addAll(String name, String[] phoneNumbers){
       if (phonebook.containsKey(name)) {
           List <String> numbers1 = phonebook.get(name);
           numbers1.add(phoneNumbers[0]);
           numbers1.add(phoneNumbers[1]);
       }
       List <String> phoneNumbers1 = new ArrayList<>(Arrays.asList(phoneNumbers));
       phonebook.put(name, phoneNumbers1);
//        if (!phonebook.containsKey(phoneNumbers)){
//            phonebook.put(name, new ArrayList<>());
//        }
//
//        for (int i = 0; i < phoneNumbers.length; i++) {
//            phonebook.put(name, new ArrayList<>()).add(Arrays.toString(phoneNumbers));
//        }

    }

    public void remove(String name){
        phonebook.remove(name);
    }

    public boolean hasEntry(String name){
        return  phonebook.containsKey(name);
    }

    public List<String> lookup(String name){
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber) {
        for (Map.Entry<String, List<String> > entry : phonebook.entrySet()){
            if (entry.getValue().contains(phoneNumber)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public List<String> getAllContactNames(){
        List<String> nameList = new ArrayList<>();
        nameList.addAll(phonebook.keySet());
        return nameList;
    }

}
