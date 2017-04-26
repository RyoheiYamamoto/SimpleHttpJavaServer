import utils.Logger;

import java.io.IOException;

public class SimpleJavaHTTPServer {

    private static Logger logger = new Logger(SimpleJavaHTTPServer.class.getSimpleName());

    public static void main(String[] args) throws IOException {

        logger.log("Hello, I'll be an HTTP Server!");
    }
}
