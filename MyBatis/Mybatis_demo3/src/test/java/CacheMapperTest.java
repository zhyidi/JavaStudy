import com.zhyidi.mybatis.mapper.CacheMapper;
import com.zhyidi.mybatis.pojo.Emp;
import com.zhyidi.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/27 16:19
 * @Version 1.0
 */
public class CacheMapperTest {
    @Test
    public void testOneCache1(){
        //只要不换SqlSession查询就都会使用一级缓存
        SqlSession sqlSession1 = SqlSessionUtils.getSqlSession();
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        Emp emp1 = mapper1.getEmpByEid(2);
        System.out.println(emp1);
        SqlSession sqlSession2 = SqlSessionUtils.getSqlSession();
        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        Emp emp2 = mapper2.getEmpByEid(2);
        System.out.println(emp2);
    }
    @Test
    public void testOneCache2(){
        //只要不换SqlSession查询就都会使用一级缓存
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp emp1 = mapper.getEmpByEid(2);
        System.out.println(emp1);
        /*int count = mapper.insertEmp(new Emp(null, "1", 1, "男", "1", null));*/
        sqlSession.clearCache();
        Emp emp2 = mapper.getEmpByEid(2);
        System.out.println(emp2);
    }

    @Test
    public void testTwoCache(){
        SqlSession sqlSession1 = SqlSessionUtils.getSqlSession();
        SqlSession sqlSession2 = SqlSessionUtils.getSqlSession();
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        CacheMapper mapper2 = sqlSession2.getMapper(CacheMapper.class);
        Emp emp1 = mapper1.getEmpByEid(1);
        System.out.println(emp1);
        sqlSession1.close();
        Emp emp2 = mapper2.getEmpByEid(1);
        System.out.println(emp2);
    }
}
