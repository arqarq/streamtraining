import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class TasksListsTest {
    private TasksLists tasksLists;
    private List<String> inputString;

    @Before
    public void init() {
        tasksLists = new TasksLists();
        inputString = tasksLists.getListOfString();
    }

    @Test
    public void shouldGroupByLevelValueOld() {
        // when
        // then
        Map<Long, List<String>> longListMap = tasksLists.groupByLevelValueOld(inputString);
        // assert
    }

    @Test
    public void shouldGroupByLevelValue() {
        // when
        // then
        Map<Long, List<String>> longListMap = tasksLists.groupByLevelValue(inputString);
        // assert
    }
}
