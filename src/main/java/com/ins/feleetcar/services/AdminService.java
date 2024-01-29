package com.ins.feleetcar.services;

import com.ins.feleetcar.entities.dtos.AdminDto;

import java.util.List;

public interface AdminService {
    String save(AdminDto adminDto);
    AdminDto adminFindByid(int id);
    List<AdminDto> findAllList ();
    String updateAdmin(int id, AdminDto adminDto);
}
