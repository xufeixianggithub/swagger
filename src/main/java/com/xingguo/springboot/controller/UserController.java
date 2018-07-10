package com.xingguo.springboot.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xingguo.springboot.model.User;
//import com.xingguo.springboot.service.UserService;

/**
 * Created by diaoxingguo on 2016/10/24.
 */
@Api(value="用户controller",description="用户操作",tags={"用户操作接口"})
@RestController
public class UserController {

  /*  @Resource
    private UserService userService;*/

    @ApiOperation("获取用户信息")
    @GetMapping("/getUserInfo")
    public User getUserInfo(@ApiParam(name="id",value="用户id",required=false) Long id,@ApiParam(name="username",value="用户名") String username) {
        //User user = userService.getUserInfo();
    	User user =new User();
    	user.setPassword("123");;
    	user.setNickName("nick");
        return user;
    }


    @ApiOperation("更改用户信息")
    @PostMapping("/updateUserInfo")
    public int updateUserInfo(@RequestBody @ApiParam(name="用户对象",value="传入json格式",required=true) User user){
        //int num = userService.updateUserInfo(user);
        return 0;
    }

    @ApiOperation("添加用户信息")
    @PostMapping("/saveUser")
    public String saveUser(@RequestBody @ApiParam(name="user",value="json fromat",required=true) User user) {
        //userService.saveUser(user);
        return "success";
    }
}