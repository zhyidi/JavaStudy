import com.zhyidi.ssm.bean.Department;
import com.zhyidi.ssm.bean.Employee;
import com.zhyidi.ssm.bean.EmployeeExample;
import com.zhyidi.ssm.dao.DepartmentMapper;
import com.zhyidi.ssm.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

/**
 * @Description:测试Dao层
 * @Author zhyidi
 * @Date: 2022/6/4 15:15
 * @Version 1.0
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {
    @Autowired
    DepartmentMapper departmentMapper;
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    SqlSession sqlSession;
    /**
     * @Description: 测试department
     * @Author zhyidi
     * @Param
     * @return
     * @Date 15:16 2022/6/4
     **/
    @Test
    public void testCURD(){
        /*ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        DepartmentMapper departmentMapper = ioc.getBean(DepartmentMapper.class);
        System.out.println(departmentMapper);*/

        //1.插入几个部门
        /*departmentMapper.insertSelective(new Department(null,"开发部"));
        departmentMapper.insertSelective(new Department(null,"测试部"));*/

        //2.插入员工信息
        /*employeeMapper.insertSelective(new Employee(null,"jerry","M","jerry@yidi.com",1));*/
        //3.批量插入多个员工
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        for(int i=0;i<1000;i++){
            String uid = UUID.randomUUID().toString().substring(0, 5)+i;
            employeeMapper.insertSelective(new Employee(null,uid,"M",uid+"@yidi.com",1));
        }
        System.out.println("批量操作完成");
    }
}
