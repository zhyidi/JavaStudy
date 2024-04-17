import com.zhyidi.mybatis.mapper.DeptMapper;
import com.zhyidi.mybatis.mapper.EmpMapper;
import com.zhyidi.mybatis.pojo.Dept;
import com.zhyidi.mybatis.pojo.Emp;
import com.zhyidi.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/24 10:30
 * @Version 1.0
 */
public class ResultMapTest {
    @Test
    public void testGetAllEmp(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> allEmp = mapper.getAllEmp();
        allEmp.forEach(System.out::println);
    }

    @Test
    public void testGetEmpAndDept(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getEmpAndDept(1);
        System.out.println(emp.getEmpName());
        System.out.println("================");
        System.out.println(emp.getDept());
    }


    @Test
    public void testDeptAndEmp(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptAndEmp = mapper.getDeptAndEmp(1);
        //延迟加载
        System.out.println(deptAndEmp.getDeptName());
        System.out.println("=================");
        System.out.println(deptAndEmp.getEmps());
    }
}
