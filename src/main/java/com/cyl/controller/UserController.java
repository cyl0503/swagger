package com.cyl.controller;


import com.cyl.common.Result;
import com.cyl.entity.User;
import com.cyl.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author cyl
 * @since 2021-12-10
 */
@RestController
@Api(tags = "用户控制层")
@RequestMapping("/user")
public class UserController {

  @Autowired
  UserService userService;

  @ApiOperation("根据id查找用户")
  @GetMapping("/getUserById")
  public Result getUserById(){
    User user = userService.getById("1L");
    return Result.success(user);
  }

  @ApiOperation("输出用户")
  @PostMapping("/user")
  public Result getUserById(@RequestBody @ApiParam("用户")String userName){
    User user = new User();
    user.setUsername(userName);
    return Result.success(user);
  }

  @GetMapping("/getUserById2")
  public User getUserById2(){
    User user = userService.getById("1L");
    return user;
  }

}
