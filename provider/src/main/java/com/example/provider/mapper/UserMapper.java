package com.example.provider.mapper;

import model.entity.Blog;
import model.entity.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author 吴成卓
 * @version V1.0
 * @Project: provider
 * @Package com.example.provider.mapper
 * @Description:
 * @date 2020/2/5 星期三 17:41
 */
public interface UserMapper {
    /**
     * 根据账号密码登录
     * @return
     */
    Users selectUserByUsernameAndPassword(@Param("username")String username,@Param("password") String password);

    /**
     * 查询所有的微博
     * @param map
     * @return
     */
    List<Blog> selectAllBlog(@Param("map")Map<String,Object>map);

    /**
     * 查询所有微博的数量
     * @param map
     * @return
     */
    Long selectAllCount(@Param("map")Map<String,Object>map);

    /**
     * 删除微博
     * @param id
     * @return
     */
    Integer delBlogById(@Param("id")Integer id);

    /**
     * 添加微博
     * @param blog
     * @return
     */
    Integer addBlog(Blog blog);

    /**
     * 展示用户
     * @param map
     * @return
     */
    List<Users>selectAllUsers(@Param("map") Map<String,Object>map);

    /**
     * 用户数量
     * @param map
     * @return
     */
    Long selectAllUsersCount(@Param("map") Map<String,Object>map);

    /**
     * 删除用户
     * @param id
     * @return
     */
    Integer delUserById(@Param("id")Integer id);

    /**
     * 添加
     * @param users
     * @return
     */
    Integer addUser(Users users);
}
