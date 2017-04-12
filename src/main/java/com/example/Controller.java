package com.example;

import com.example.dao.ApkDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by replay on 2017. 3. 27..
 */

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    ApkDao apkDao;

    @RequestMapping("/")
    public String aaa(ModelMap modelMap){
        List<APK> apks = apkDao.getApkList();

        modelMap.addAttribute("apklist", apks);
        return "index";
    }
}
