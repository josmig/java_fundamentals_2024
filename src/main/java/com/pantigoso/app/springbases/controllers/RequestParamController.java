package com.pantigoso.app.springbases.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pantigoso.app.springbases.models.dto.ParamDto;

import jakarta.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("api/params")
public class RequestParamController {

    @GetMapping("/foo")
    public ParamDto foo (@RequestParam(required = false, defaultValue = "valor por defecto") String message){
        ParamDto param = new ParamDto();
        param.setMessage(message);
        
        return param;
    }

    @GetMapping("/bar")
    public ParamDto bar(@RequestParam String text, @RequestParam Integer code){
        
        ParamDto params = new ParamDto();
        params.setMessage(text);
        params.setCode(code);

        return params;
    }

    //hacerlo de forma nativa
    @GetMapping("/nativo")
    public ParamDto request(HttpServletRequest request){
        Integer code = 0;
        try {
            code = Integer.parseInt(request.getParameter( "code"));
        } catch (NumberFormatException e) {}

        ParamDto params = new ParamDto();
        params.setCode(code);
        params.setMessage(request.getParameter("message"));
        return params;
    }
    
}
