package com.zhyidi.mybatis.mapper;

import com.zhyidi.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/22 17:17
 * @Version 1.0
 */
public interface SQLMapper {
    /**
     * @Description: 根据用户名模糊查询用户信息
     * @Author zhyidi
     * @Param
     * @return
     * @Date 17:17 2022/5/22
     **/
    List<User> getUserByLike(@Param("username") String username);

    /**
     * @Description: 批量删除
     * @Author zhyidi
     * @Param
     * @return
     * @Date 17:31 2022/5/22
     **/
    int deleteMore(@Param("ids") String ids);

    /**
     * @Description: 查询指定表的数据
     * @Author zhyidi
     * @Param
     * @return
     * @Date 17:49 2022/5/22
     **/
    List<User> getUserByTableName(@Param("tableName") String tableName);

    /**
     * 添加用户信息
     * @param user
     * @return
     * useGeneratedKeys：设置使用自增的主键
     * keyProperty：因为增删改有统一的返回值是受影响的行数，因此只能将获取的自增的主键放在传输的参数user对象的某个属性中
     */
    int insertUser(User user);
}
