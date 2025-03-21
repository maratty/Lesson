package lesson9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// так как по ключу не вывести два номера телефона, то будем выводить по значению
class Phonebook {

    // Получить все соответствующие ключевые значения в соответствии со значением value
    public static List<String> getKeyList(HashMap<String, String> map, String value) {
        List<String> keyList = new ArrayList();
        for (String getKey : map.keySet()) {
            if (map.get(getKey).equals(value)) {
                keyList.add(getKey);
            }
        }
        return keyList;
    }

    public static void book() {

        HashMap<String, String> map = new HashMap();
        map.put("8999111111", "Лена");
        map.put("8999222222", "Оля");
        map.put("8999333333", "Лена");
        map.put("8999444444", "Толя");
        map.put("8999555555", "Толя");

        // Получить все ключевые значения
        System.out.println("Номера телефонов абонента Лена:" + Phonebook.getKeyList(map, "Лена"));

    }

}