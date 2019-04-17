package com.my.test.sbmm.user.open;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String findById(long id) {
        return "I'm a user.";
    }
}
