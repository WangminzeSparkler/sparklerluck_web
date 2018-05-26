package com.sparklerluck.site.web.controller;

import com.sparklerluck.site.IDao.RoleMapper;
import com.sparklerluck.site.model.Role;
import com.sparklerluck.site.web.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value="/roleController")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping(value="/role", method = RequestMethod.GET)
    public String toRolePage(HttpServletRequest request){
        Role role = roleService.selectByPrimaryKey(1);
        request.setAttribute("role", role);
        return "role";
    }
}
