package jo.seongju.hospital;

import org.junit.Test;

public class AppTest {

    static MainClient mainClient = new MainClient();

    @Test
    public void test() {
        mainClient.start();
    }

    public static void main(String[] args) {
        mainClient.start();
    }
}

