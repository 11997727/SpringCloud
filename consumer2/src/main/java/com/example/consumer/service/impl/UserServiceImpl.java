package com.example.consumer.service.impl;

import com.example.consumer.service.UserService;
import model.entity.Blog;
import model.entity.Users;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 吴成卓
 * @version V1.0
 * @Project: consumer
 * @Package com.example.consumer.service.impl
 * @Description:
 * @date 2020/2/5 星期三 18:44
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public Map<String, Object> queryUserByUserNameAndPassword(String username, String password) {
        Map<String,Object>map=new HashMap<>();
        map.put("code",500);
        map.put("msg","服务器正忙");
        return map;
    }

    @Override
    public Map<String, Object> queryAllBlog(Map<String, Object> map) {
        Map<String,Object>map1=new HashMap<>();
        map1.put("code",500);
        map1.put("msg","服务器正忙");
        return map1;
    }

    @Override
    public Map<String, Object> delBlogById(Integer id) {
        Map<String,Object>map1=new HashMap<>();
        map1.put("code",500);
        map1.put("msg","服务器正忙");
        return map1;
    }

    @Override
    public Map<String, Object> addBlog(Blog blog) {
        Map<String,Object>map=new HashMap<>();
        map.put("code",500);
        map.put("msg","服务器正忙");
        return map;
    }

    @Override
    public Map<String, Object> queryAllUser(Map<String, Object> map) {
        Map<String,Object>map1=new HashMap<>();
        map1.put("code",500);
        map1.put("msg","服务器正忙");
        return map1;
    }

    @Override
    public Map<String, Object> delUserById(Integer id) {
        Map<String,Object>map1=new HashMap<>();
        map1.put("code",500);
        map1.put("msg","服务器正忙");
        return map1;
    }

    @Override
    public Map<String, Object> addUser(Users users) {
        Map<String,Object>map1=new HashMap<>();
        map1.put("code",500);
        map1.put("msg","服务器正忙");
        return map1;
    }


}
