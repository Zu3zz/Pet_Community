package com.nowcoder.community.controller;

import com.nowcoder.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Date: 2020/4/13 5:05 下午
 *
 * @author 3zZ.
 */
@CrossOrigin
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Map<String, String> userLogin(@RequestParam(value = "name") String name,
                                         @RequestParam(value = "password") String password) {
        Boolean state = userService.userLogin(name, password);
        Map<String, String> map = new HashMap<>();
        if (state) {
            map.put("success", "true");
            map.put("statusCode","200");
            map.put("username", name);
            map.put("password",password);
            return map;
        } else {
            map.put("success", "false");
            map.put("statusCode","403");
            return map;
        }
    }
}
