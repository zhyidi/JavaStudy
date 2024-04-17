package com.zhyidi.mybatis.mapper;

import com.zhyidi.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author zhyidi
 * @Date: 2022/5/22 16:22
 * @Version 1.0
 */
public interface SelectMapper {
    /**
     * @Description: 根据id查询用户信息
     * @Author zhyidi
     * @Param
     * @return
     * @Date 16:23 2022/5/22
     **/
    User getUserById(@Param("id") Integer id);


    /**
     * @Description: 查询所有用户信息
     * @Author zhyidi
     * @Param
     * @return
     * @Date 16:23 2022/5/22
     **/
    List<User> getAllUser();

    /**
     * @Description: 查询总记录数
     * @Author zhyidi
     * @Param
     * @return
     * @Date 16:23 2022/5/22
     **/
    int getCount();

    /**
     * @Description: 根据用户id查询用户信息为map集合
     * @Author zhyidi
     * @Param
     * @return
     * @Date 16:23 2022/5/22
     **/
    Map<String, Object> getUserToMap(@Param("id") int id);

    /**
     * @Description: 查询所有用户信息为map集合
     * @Author zhyidi
     * @Param
     * @return
     * @Date 16:53 2022/5/22
     **/
    List<Map<String, Object>> getAllUserToMap();

    /**
     * @Description: 查询所有用户信息为map集合
     * @Author zhyidi
     * @Param
     * @return
     * @Date 16:53 2022/5/22
     **/
    @MapKey("id")
    Map<Integer, Object> getAllUserToMap1();
}
