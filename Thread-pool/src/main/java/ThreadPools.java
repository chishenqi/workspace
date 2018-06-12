










import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by BG332387 on 2018/5/22.
 */
public class ThreadPools {
    ExecutorService executorService = Executors.newFixedThreadPool(10000);
    @Test
    public void testPost() throws InterruptedException {
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
            Post post=new Post();
            executorService.execute(post);
            Thread.sleep(1000);
        }

    }
}
