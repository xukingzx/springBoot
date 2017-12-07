import dream.controller.SampleController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author wangxu13798
 * @date 2017/12/6
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SampleController.class)
public class HelloWorldTests {
//    private MockMvc mvc;
//
//    @Before
//    public void setUp() throws Exception {
//        mvc = MockMvcBuilders.standaloneSetup(new dream.controller.SampleController()).build();
//    }
    @Autowired
    SampleController sampleController;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void getHello() throws Exception {
//        mvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andDo(MockMvcResultHandlers.print())
//                .andReturn();
        System.out.println(sampleController.home());
        stringRedisTemplate.opsForValue().set("a","b");
    }
}
