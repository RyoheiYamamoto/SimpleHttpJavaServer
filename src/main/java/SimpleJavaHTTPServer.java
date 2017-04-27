import utils.Logger;

import java.io.IOException;

/**
 * シンプルなHTTPサーバーです。
 * java.netパッケージを使います。
 * issueと紐付いてます。
 */
public class SimpleJavaHTTPServer {

    private static Logger logger = new Logger(SimpleJavaHTTPServer.class.getSimpleName());

    public static void main(String[] args) throws IOException {
        // TODO hakiba 全く進んでないけど、プッシュします。 by anyone (2017/04/27)
        logger.log("Hello, I'll be an HTTP Server!");
    }
}
