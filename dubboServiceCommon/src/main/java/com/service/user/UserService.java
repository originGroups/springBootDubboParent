package com.service.user;



import com.bean.UserAddress;

import java.util.List;

/**
 * 用户服务
 */
public interface UserService {

    /**
     * 根据用户id返回用户所有的收获地址
     * @param userId
     * @return
     */
    public List<UserAddress> qryUserAddressList(String userId);
}
