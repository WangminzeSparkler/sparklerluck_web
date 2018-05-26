package com.sparklerluck.site.web.service;

import com.sparklerluck.site.IDao.RoleMapper;
import com.sparklerluck.site.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleMapper roleMapper;

    public Role selectByPrimaryKey(Integer id){
        return roleMapper.selectByPrimaryKey(id);
    }
}
