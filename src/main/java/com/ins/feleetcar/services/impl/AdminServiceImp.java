package com.ins.feleetcar.services.impl;

import com.ins.feleetcar.entities.Admin;
import com.ins.feleetcar.entities.dtos.AdminDto;
import com.ins.feleetcar.entities.mappers.AdminMapper;
import com.ins.feleetcar.repositories.AdminRepository;
import com.ins.feleetcar.services.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AdminServiceImp implements AdminService {
    private AdminRepository adminRepository;
    private AdminMapper adminMapper;

    public AdminServiceImp(AdminRepository adminRepository, AdminMapper adminMapper) {
        this.adminRepository = adminRepository;
        this.adminMapper = adminMapper;
    }

    // mapper Admin
    Admin getEntity(AdminDto adminDto){
        return  adminMapper.toEntity(adminDto);
    }
    AdminDto getDto(Admin admin){
        return adminMapper.toDto(admin);
    }


    @Override
    public String save(AdminDto adminDto) {
         adminRepository.save(getEntity(adminDto));
         return "Admin add successfully";
    }

    @Override
    public AdminDto adminFindByid(int id) {
        return getDto(adminRepository.findById(id).get());
    }

    @Override
    public List<AdminDto> findAllList() {
        return adminRepository.findAll().stream()
                .map(
                        (admin)->
                            getDto(admin)

                ).toList();
    }

    @Override
    public String updateAdmin(int id, AdminDto adminDto) {
        if (adminRepository.existsById(id)) {
            adminRepository.save(getEntity(adminDto));
            return "Admin update successfully";
        } else {
            return "Admin update faillure";
        }
    }
}
