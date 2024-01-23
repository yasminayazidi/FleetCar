package com.ins.feleetcar.controllers.api;

import com.ins.feleetcar.entities.dtos.AdminDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("admin")
@CrossOrigin(origins = "*")
public interface AdminApi {
    @PostMapping()
    String save(@RequestBody AdminDto adminDto);
    @GetMapping("/{id}")
    AdminDto adminFindByid(@PathVariable int id);
    @GetMapping()
    List<AdminDto> findAllList ();
    @PutMapping("/{id}")
    String updateAdmin(@PathVariable int id, @RequestBody AdminDto adminDto);
}
