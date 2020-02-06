package com.example.consumer.controller;

import com.alibaba.fastjson.JSON;
import com.example.consumer.service.UserService;
import com.qiniu.http.Response;
import com.qiniu.storage.model.DefaultPutRet;
import model.entity.Blog;
import model.entity.Users;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 吴成卓
 * @version V1.0
 * @Project: consumer
 * @Package com.example.consumer.controller
 * @Description:
 * @date 2020/2/5 星期三 18:49
 */
@RestController
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private QNYUtils qnyUtils;
    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam("username")String username,@RequestParam("password")String password){
        System.out.println("我是消费者1");
        return JSON.toJSONString(userService.queryUserByUserNameAndPassword(username, password));
    }

    /**
     * 微博列表
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping(value = "/showBlog",method = RequestMethod.POST)
    public String showBlog(@RequestParam(value = "page" ,required = false ,defaultValue = "1")Integer page,
                           @RequestParam(value = "limit" ,required = false ,defaultValue = "5")Integer limit){
        Map<String,Object> map=new HashMap<>();
        map.put("page",page);
        map.put("limit",limit);
        Map<String, Object> map1 = userService.queryAllBlog(map);
        return JSON.toJSONString(map1);
    }

    /**
     * 删除微博
     * @param id
     * @return
     */
    @RequestMapping(value = "/delBlogById",method = RequestMethod.POST)
    public String delBlogById(@RequestParam("id")Integer id){
        return JSON.toJSONString(userService.delBlogById(id));
    }

    /**
     * 添加微博
     * @param blog
     * @return
     */
    @RequestMapping(value = "/addBlog",method = RequestMethod.POST)
    public String addBlog(Blog blog){
        return JSON.toJSONString(userService.addBlog(blog));
    }

    /**
     * 用户列表
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping(value = "/showUsers",method = RequestMethod.POST)
    public String showUsers(@RequestParam(value = "page" ,required = false ,defaultValue = "1")Integer page,
                           @RequestParam(value = "limit" ,required = false ,defaultValue = "5")Integer limit){
        Map<String,Object> map=new HashMap<>();
        map.put("page",page);
        map.put("limit",limit);
        Map<String, Object> map1 = userService.queryAllUser(map);
        return JSON.toJSONString(map1);
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @RequestMapping(value = "/delUserById",method = RequestMethod.POST)
    public String delUserById(@RequestParam("id") Integer id){
        return JSON.toJSONString(userService.delUserById(id));
    }

    /**
     * 添加用户
     * @param users
     * @return
     */
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public String addUser(Users users){
        return JSON.toJSONString(userService.addUser(users));
    }

    /**
     * 头像上传服务器
     * @param file
     * @return
     */
    @RequestMapping(value = "/usersUpload", method = RequestMethod.POST)
    public String upload(@RequestParam("file") MultipartFile file) {
            String name = file.getOriginalFilename();
            DefaultPutRet defaultPutRet = null;
            Map<String, Object> map = new HashMap<>();
            try {
                Response response = qnyUtils.upload(file.getInputStream(), name);
                defaultPutRet = qnyUtils.defaultPutRet(response);
            } catch (Exception e) {
                map.put("status", "failed");
                map.put("code", 4);
                e.printStackTrace();
            }
            map.put("url", qnyUtils.getPath() + defaultPutRet.key);
            if (defaultPutRet.key != null && defaultPutRet.key != "") {
                map.put("status", "success");
                map.put("code", 0);
            }
            return JSON.toJSONString(map);
    }
}
