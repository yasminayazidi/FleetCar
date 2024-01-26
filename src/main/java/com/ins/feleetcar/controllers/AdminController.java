package com.ins.feleetcar.controllers;

import com.ins.feleetcar.controllers.api.AdminApi;
import com.ins.feleetcar.entities.dtos.AdminDto;
import com.ins.feleetcar.services.AdminService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController implements AdminApi {
    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @Override
    public String save(AdminDto adminDto) {
        return adminService.save(adminDto);
    }

    @Override
    public AdminDto adminFindByid(int id) {
        return adminService.adminFindByid(id);
    }

    @Override
    public List<AdminDto> findAllList() {
        return adminService.findAllList();
    }

    @Override
    public String updateAdmin(int id, AdminDto adminDto) {
        return adminService.updateAdmin(id,adminDto);
    }
}
