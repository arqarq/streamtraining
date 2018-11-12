public class Main {
    public static void main(String[] args) {
        System.out.println("==========");
        System.out.println("=== Longs:");
        System.out.println("==========");
        new TasksLongs().execute();
        System.out.println("==========");
        System.out.println("=== Ints:");
        System.out.println("==========");
        new TasksInts().execute();
        System.out.println("==========");
        System.out.println("=== Lists:");
        System.out.println("==========");
        new TasksLists().execute();
        System.out.println("==========");
        System.out.println("=== Maps:");
        System.out.println("==========");
        new TasksMaps().execute();
        System.out.println("Done.");
    }
}
