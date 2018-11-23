import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class TasksListsTest {
    private TasksLists tasksLists;
    private List<String> inputString;
    private Map<Long, List<String>> longListMap = null;

    @Before
    public void init() {
        tasksLists = new TasksLists();
        inputString = tasksLists.getListOfString();
    }

    @Test
    public void shouldGroupByLevelValue() {
        // when
        // then
//        long l = System.currentTimeMillis();
        longListMap = tasksLists.groupByLevelValue(inputString);
//        System.out.println("Czas z wydzieleniem pola w metodzie: " + (System.currentTimeMillis() - l));
        // assert
    }

    @Test
    public void shouldGroupByLevelValueOld() {
        // when
        // then
//        long l = System.currentTimeMillis();
        longListMap = tasksLists.groupByLevelValueOld(inputString);
//        System.out.println("Czas bez wydzielenia pola w metodzie: " + (System.currentTimeMillis() - l));
        // assert
    }
}
