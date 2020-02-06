package com.example.consumer.service;

import com.example.consumer.service.impl.UserServiceImpl;
import model.entity.Blog;
import model.entity.Users;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author 吴成卓
 * @version V1.0
 * @Project: consumer
 * @Package com.example.consumer.service
 * @Description:
 * @date 2020/2/5 星期三 18:41
 */
@FeignClient(value = "provider",fallback = UserServiceImpl.class)
public interface UserService {

    @RequestMapping("/login")
    public Map<String,Object> queryUserByUserNameAndPassword(@RequestParam("username")String username, @RequestParam("password")String password);

    @RequestMapping("/showBlog")
    public Map<String,Object> queryAllBlog(@RequestBody Map<String,Object>map);

    @RequestMapping("/delBlogById")
    public Map<String,Object> delBlogById(@RequestParam("id") Integer id);

    @RequestMapping("/addBlog")
    public Map<String,Object>addBlog(@RequestBody Blog blog);

    @RequestMapping("/showUser")
    public Map<String,Object> queryAllUser(@RequestBody Map<String,Object>map);

    @RequestMapping("/delUserById")
    public Map<String,Object>delUserById(@RequestParam("id")Integer id);

    @RequestMapping("/addUser")
    public Map<String,Object>addUser(@RequestBody Users users);


}
