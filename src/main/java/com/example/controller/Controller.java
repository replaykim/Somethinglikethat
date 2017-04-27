package com.example.controller;

import com.example.dao.ApkDao;
import com.example.model.APK;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by replay on 2017. 3. 27..
 */

@org.springframework.stereotype.Controller
public class    Controller {
    @Autowired
    ApkDao apkDao;

    @RequestMapping("/")
    public String aaa(ModelMap modelMap){
        List<APK> apks = apkDao.getApkList();

        modelMap.addAttribute("apklist", apks);
        return "index";
    }

    @RequestMapping("content")
    public String bbb(ModelMap modelMap, @RequestParam("APK_NO") Integer APK_NO){
        APK apk = apkDao.getApk(APK_NO);

        modelMap.addAttribute("apk", apk);

        return "content";
    }
}
