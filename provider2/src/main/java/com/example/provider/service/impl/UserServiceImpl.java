package com.example.provider.service.impl;

import com.example.provider.mapper.UserMapper;
import model.entity.Blog;
import model.entity.Users;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 吴成卓
 * @version V1.0
 * @Project: provider
 * @Package com.example.provider.service.impl
 * @Description:
 * @date 2020/2/5 星期三 18:16
 */
@RestController
public class UserServiceImpl {
    @Resource
    private UserMapper userMapper;

    @RequestMapping("/login")
    public Map<String,Object> queryUserByUserNameAndPassword(@RequestParam("username")String username, @RequestParam("password")String password){
        System.out.println("我是提供者2");
      Map<String,Object>map=new HashMap<>();
        map.put("code",4);
        Users users = userMapper.selectUserByUsernameAndPassword(username, password);
        if(users!=null){
            map.put("code",0);
            map.put("data",users);
        }
        return map;
    }

    @RequestMapping("/showBlog")
    public Map<String,Object> queryAllBlog(@RequestBody Map<String,Object>map){
        Map<String,Object>statusMap=new HashMap<String, Object>();
        statusMap.put("code",0);
        statusMap.put("msg","");
        statusMap.put("count",0);
        int page=Integer.parseInt(map.get("page").toString());
        int limit=Integer.parseInt(map.get("limit").toString());
        int index=(page-1)*limit;
        map.put("index",index);
        List<Blog> blog = userMapper.selectAllBlog(map);
        Long num = userMapper.selectAllCount(map);
        if(num>0){
            statusMap.put("data",blog);
            statusMap.put("count",num);
        }
        return statusMap;
    }

    @RequestMapping("/delBlogById")
    public Map<String,Object> delBlogById(@RequestParam("id") Integer id){
        Map<String,Object>map=new HashMap<>();
        map.put("code",4);
        Integer integer = userMapper.delBlogById(id);
        System.out.println(integer);
        if(integer>0){
            map.put("code",0);
        }
        return map;
    }

    @RequestMapping("/addBlog")
    public Map<String,Object>addBlog(@RequestBody Blog blog){
        Map<String,Object>map=new HashMap<>();
        map.put("code",4);
        Integer integer = userMapper.addBlog(blog);
        if(integer>0){
            map.put("code",0);
        }
        return map;
    }


    @RequestMapping("/showUser")
    public Map<String,Object> queryAllUser(@RequestBody Map<String,Object>map){
        Map<String,Object>statusMap=new HashMap<String, Object>();
        statusMap.put("code",0);
        statusMap.put("msg","");
        statusMap.put("count",0);
        int page=Integer.parseInt(map.get("page").toString());
        int limit=Integer.parseInt(map.get("limit").toString());
        int index=(page-1)*limit;
        map.put("index",index);
        List<Users> Users = userMapper.selectAllUsers(map);
        Long num = userMapper.selectAllUsersCount(map);
        if(num>0){
            statusMap.put("data",Users);
            statusMap.put("count",num);
        }
        return statusMap;
    }

    @RequestMapping("/delUserById")
    public Map<String,Object>delUserById(@RequestParam("id")Integer id){
        Map<String,Object>map=new HashMap<>();
        map.put("code",4);
        Integer integer = userMapper.delUserById(id);
        System.out.println(integer);
        if(integer>0){
            map.put("code",0);
        }
        return map;
    }

    @RequestMapping("/addUser")
    public Map<String,Object>addUser(@RequestBody Users users){
        Map<String,Object>map=new HashMap<>();
        map.put("code",4);
        Integer integer = userMapper.addUser(users);
        if(integer>0){
            map.put("code",0);
        }
        return map;
    }
}
