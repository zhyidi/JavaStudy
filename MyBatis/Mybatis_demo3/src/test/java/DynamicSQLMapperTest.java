import com.zhyidi.mybatis.mapper.DynamicSQLMapper;
import com.zhyidi.mybatis.pojo.Emp;
import com.zhyidi.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/24 16:22
 * @Version 1.0
 */
public class DynamicSQLMapperTest {
    @Test
    public void testGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> empByCondition = mapper.getEmpByCondition(new Emp(2, null, 2, "女", null, null));
        empByCondition.forEach(System.out::println);
    }

    @Test
    public void testGetEmpByChoose(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> empByCondition = mapper.getEmpByChoose(new Emp(null, null, null, null, null, null));
        empByCondition.forEach(System.out::println);
    }

    @Test
    public void testDeleteMoreByArray(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        mapper.deleteMoreByArray(new Integer[]{6,7,8});
    }

    @Test
    public void testInsertMoreByList(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> emps = new ArrayList<>();
        emps.add(new Emp(null,"1",1,"1","1",null));
        emps.add(new Emp(null,"2",2,"2","2",null));
        emps.add(new Emp(null,"3",3,"3","3",null));
        mapper.insertMoreByList(emps);
    }
}
