package Reflection;
import java.lang.reflect.*;

public class TestClass {

    private static int tid = 55;

    private String tstr = "This is confidential / secret!";

    public static void main(String[] args) throws Exception {

        TestClass tc = new TestClass();

        // Get runtime class information
        Class<?> c1 = tc.getClass();

        System.out.println(c1.getName());

        // Getting private members
        Field[] fields = c1.getDeclaredFields();

        for (Field f : fields) {
            System.out.println(
                    f.getName() + " -> "
                            + Modifier.toString(f.getModifiers()));
        }

        // Accessing private data
        Field str = c1.getDeclaredField("tstr");

        str.setAccessible(true);

        String whatsInStr = (String) str.get(tc);

        System.out.println(
                "Information hiding in tstr is: " + whatsInStr);
    }
}