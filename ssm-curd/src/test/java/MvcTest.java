import com.github.pagehelper.PageInfo;
import com.zhyidi.ssm.bean.Employee;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

/**
 * @Description:使用spring测试请求功能
 * @Author zhyidi
 * @Date: 2022/6/4 16:41
 * @Version 1.0
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml","file:src/main/webapp/WEB-INF/dispatchServlet-servlet.xml"})
public class MvcTest {
    @Autowired
    WebApplicationContext context;
    //虚拟mvc请求，获取处理结果
    MockMvc mockMvc;

    @Before
    public void initMockMvc(){
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void testPageInfo() throws Exception {
        MvcResult result= mockMvc.perform(MockMvcRequestBuilders.get("/listEmps").param("pn", "5")).andReturn();
        MockHttpServletRequest request = result.getRequest();
        PageInfo pageInfo = (PageInfo) request.getAttribute("pageInfo");
        System.out.println("当前页码："+pageInfo.getPageNum());
        System.out.println("总页码："+pageInfo.getPages());
        System.out.println("总记录数："+pageInfo.getTotal());
        System.out.println("连续显示的页码：");
        int[] navigatepageNums = pageInfo.getNavigatepageNums();
        for (int index:
             navigatepageNums) {
            System.out.print(index+" ");
        }
        List<Employee> list = pageInfo.getList();
        for (Employee e:
             list) {
            System.out.println("ID:"+e.getEmpId()+"===>"+e.getEmpName());
        }
    }
}
