package com.example.doc.controller;

import com.example.doc.entity.Doc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/doc")
public class DocController {

    public List<Doc> selectDoc(){
        return null;
    }
}
