package zwl.demo.service.impl;

import zwl.demo.service.UserService;

/**
 * @author zhangwanli
 * @description
 * @date 2017-07-22 下午4:04
 */
public class UserServiceImpl implements UserService {
    public String getUserName() {
        System.out.println("Being invoked");
        return "test user";
    }
}