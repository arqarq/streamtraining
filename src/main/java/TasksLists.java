import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TasksLists {

    public void execute() {
        List<String> removedDuplicates = removeDuplicates(getListOfString());
        System.out.println("Removed duplicates: " + removedDuplicates);

        String concatenatedString = concatenateStrings(getListOfString());
        System.out.println("Concatenated : " + concatenatedString);

        List<String> filteredByPrefix = filterByPrefix(getListOfString(), "Level-2");
        System.out.println("Filtered by prefix: " + filteredByPrefix);

        List<String> filteredBySuffix = filterBySuffix(getListOfString(), "String-7");
        System.out.println("Filtered by suffix: " + filteredBySuffix);

        Map<Long, List<String>> groupedByLevelValue = groupByLevelValue(getListOfString());
        System.out.println("Grouped by level value: " + groupedByLevelValue);
    }

    private List<String> removeDuplicates(List<String> listOfString) {
        return listOfString.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    private String concatenateStrings(List<String> listOfString) {
        return listOfString.stream()
                .collect(Collectors.joining());
    }

    private List<String> filterByPrefix(List<String> listOfString, String prefix) {
        return listOfString.stream()
                .filter(x -> x.startsWith(prefix))
                .collect(Collectors.toList());
    }

    private List<String> filterBySuffix(List<String> listOfString, String suffix) {
        return listOfString.stream()
                .filter(x -> x.endsWith(suffix))
                .collect(Collectors.toList());
    }

    Map<Long, List<String>> groupByLevelValueOld(List<String> listOfString) {
        return listOfString.stream()
//                .filter(x -> x.startsWith("Level-"))
                .filter(x -> x.matches("^Level-\\d.*$"))
                .collect(Collectors.groupingBy(x -> Long.valueOf("" + x.charAt(6))));
    }

    Map<Long, List<String>> groupByLevelValue(List<String> listOfString) {
        Pattern pattern = Pattern.compile("^Level-\\d.*$");

        return listOfString.stream()
                .filter(x -> pattern.matcher(x).matches())
                .collect(Collectors.groupingBy(x -> Long.valueOf("" + x.charAt(6))));
    }

    List<String> getListOfString() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                list.add("Level-" + i + ":String-" + j);
            }
        }
        list.add("Duplicate-1");
        list.add("Duplicate-1");
        list.add("Duplicate-2");
        list.add("Duplicate-2");
        list.add("Duplicate-2");
        return list;
    }

}
