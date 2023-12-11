package com.htu.ssm.controller;

import com.htu.ssm.po.Address;
import com.htu.ssm.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;
    @RequestMapping("/all")
    public List<Address> getAllAdds(String wd){
        return addressService.getAdds(wd);
    }

    @GetMapping("/get")
    public Address getFood(Long adUserId){
        return addressService.getAddByNo(adUserId);
    }
    @PostMapping("/del")
    public int delFoodByNo(Long adUserId){
        return addressService.delAddByNo(adUserId);
    }

    @PostMapping("/add")
    public int addAdd(@RequestBody Address address){
        return addressService.addAdd(address);
    }
    @PostMapping("/edit")
    public int editAdd(@RequestBody Address address){
        return addressService.editAdd(address);
    }
}
