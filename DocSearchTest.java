import static org.junit.Assert.*;
import org.junit.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;


public class DocSearchTest {
    @Test
    public void testIncrement() throws URISyntaxException, IOException {
        Handler h = new Handler("technical/");
        URI increment = new URI("http://localhost/increment");
        //URI rootPath = new URI("http://localhost/");
        assertEquals(h.handleRequest(increment),"Don't know how to handle that path!");
    }
}