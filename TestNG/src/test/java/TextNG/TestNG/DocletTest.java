package TextNG.TestNG;

import org.junit.Test;

import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple Doclet.
 */
public class DocletTest
{
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testDoclet() throws URISyntaxException {
        callJavadoc("com.sample");

        assertTrue(true);
    }

    /**
     * Calls Javadoc tool.
     *
     * <p>The arguments needed to call this project's doclet
     * and use the test resource's directory as source path
     * are already included.</p>
     *
     * @param extraArgs Any extra arguments to Javadoc
     */
    public static void callJavadoc(String ...extraArgs) {
        final String docletClass = "TextNG.TestNG.Doclet";

        Path root = null;
        try {
            root = Paths.get(DocletTest.class.getResource("/root.txt").toURI())
                    .getParent();
        } catch (URISyntaxException e) {
            throw new IllegalStateException("This should never happen", e);
        }

        List<String> baseArgs = Arrays.asList(
                "-doclet", docletClass,
                "-sourcepath", root.toString()
        );
        List<String> args = new LinkedList<String>(baseArgs);
        for (String arg : extraArgs) {
            args.add(arg);
        }

        com.sun.tools.javadoc.Main.execute(args.toArray(new String[0]));
    }
}
