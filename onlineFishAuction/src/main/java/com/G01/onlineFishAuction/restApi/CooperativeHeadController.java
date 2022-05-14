package com.G01.onlineFishAuction.restApi;

import com.G01.onlineFishAuction.business.ICooperativeHeadService;
import com.G01.onlineFishAuction.entities.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/cooperativeHead")
public class CooperativeHeadController {
    private ICooperativeHeadService iCooperativeHeadService;

    @Autowired
    public CooperativeHeadController(ICooperativeHeadService iCooperativeHeadService) {
        this.iCooperativeHeadService = iCooperativeHeadService;
    }

    @GetMapping("/getCode")
    public Code getCode(){
        return  new Code(iCooperativeHeadService.createCode());
    }
}
