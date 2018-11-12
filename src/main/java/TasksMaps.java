import java.util.*;
import java.util.stream.Collectors;

public class TasksMaps {

    public void execute() {
        Map<String, List<String>> mapOfString = getMapOfString();

        List<String> flattened = flattenPreserveDuplicates(getMapOfString());
        System.out.println("Flattened with duplicates: " + flattened);

        List<String> flattenedNoDuplicates = flattenNoDuplicates(getMapOfString());
        System.out.println("Flattened with no duplicates: " + flattenedNoDuplicates);
    }

    private List<String> flattenPreserveDuplicates(Map<String, List<String>> mapOfString) {
        throw new UnsupportedOperationException("Todo.");
    }

    private List<String> flattenNoDuplicates(Map<String, List<String>> mapOfString) {
        throw new UnsupportedOperationException("Todo.");
    }

    private Map<String,List<String>> getMapOfString() {
        Map<String,List<String>> map = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            List<String> list = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                list.add("List" + i +"-String" + j);
            }
            list.add("Duplicate-1");
            list.add("Duplicate-2");
            map.put("ListNumber" + i, list);
        }
        return map;
    }

}
