package com.sunyi.cloud.controller;

import com.sunyi.cloud.pojo.entity.User;
import com.sunyi.cloud.service.UserService;
import com.sunyi.cloud.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 采取rest风格的api
 *  1.post请求用做增加（json风格传参数）
 *  2.delete请求用做删除
 *  3.get请求用做查询
 *  4.put请求用做修改（json风格传参）
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public Object addUser(@RequestBody User user) {
        if (user == null || user.getName() == null || "".equals(user.getName()) || user.getUsername() == null || "".equals(user.getUsername()))
            return ResponseUtil.fail(401, "参数值错误！");
        return userService.addUser(user);
    }

    @DeleteMapping("/user/{userId}")
    public Object deleteUser(@PathVariable String userId) {
        return null;
    }

    @GetMapping("/user/{name}")
    public Object getUser(@PathVariable String name) {
        return null;
    }

    @PutMapping("/user")
    public Object updateUser(@RequestBody User user) {
        return null;
    }

}
