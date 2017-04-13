package com.example.model;

import java.util.Date;

/**
 * Created by blue on 2017-04-12.
 */
public class APK {
    int APK_NO;
    String APK_NAME;
    String id;
    String VERSION_NO;
    String CAP_AMT;
    String STORAGE_URL;
    String SCREEN_URL;
    int CTGRY_NO;
    String DOWN_CNT;
    String VIEW_CNT;
    String RECM_CNT;
    String INV_AMT;
    Date REG_DT;

    public int getAPK_NO() {
        return APK_NO;
    }

    public void setAPK_NO(int APK_NO) {
        this.APK_NO = APK_NO;
    }

    public String getAPK_NAME() {
        return APK_NAME;
    }

    public void setAPK_NAME(String APK_NAME) {
        this.APK_NAME = APK_NAME;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVERSION_NO() {
        return VERSION_NO;
    }

    public void setVERSION_NO(String VERSION_NO) {
        this.VERSION_NO = VERSION_NO;
    }

    public String getCAP_AMT() {
        return CAP_AMT;
    }

    public void setCAP_AMT(String CAP_AMT) {
        this.CAP_AMT = CAP_AMT;
    }

    public String getSTORAGE_URL() {
        return STORAGE_URL;
    }

    public void setSTORAGE_URL(String STORAGE_URL) {
        this.STORAGE_URL = STORAGE_URL;
    }

    public String getSCREEN_URL() {
        return SCREEN_URL;
    }

    public void setSCREEN_URL(String SCREEN_URL) {
        this.SCREEN_URL = SCREEN_URL;
    }

    public int getCTGRY_NO() {
        return CTGRY_NO;
    }

    public void setCTGRY_NO(int CTGRY_NO) {
        this.CTGRY_NO = CTGRY_NO;
    }

    public String getDOWN_CNT() {
        return DOWN_CNT;
    }

    public void setDOWN_CNT(String DOWN_CNT) {
        this.DOWN_CNT = DOWN_CNT;
    }

    public String getVIEW_CNT() {
        return VIEW_CNT;
    }

    public void setVIEW_CNT(String VIEW_CNT) {
        this.VIEW_CNT = VIEW_CNT;
    }

    public String getRECM_CNT() {
        return RECM_CNT;
    }

    public void setRECM_CNT(String RECM_CNT) {
        this.RECM_CNT = RECM_CNT;
    }

    public String getINV_AMT() {
        return INV_AMT;
    }

    public void setINV_AMT(String INV_AMT) {
        this.INV_AMT = INV_AMT;
    }

    public Date getREG_DT() {
        return REG_DT;
    }

    public void setREG_DT(Date REG_DT) {
        this.REG_DT = REG_DT;
    }

    public Date getUPDT_DT() {
        return UPDT_DT;
    }

    public void setUPDT_DT(Date UPDT_DT) {
        this.UPDT_DT = UPDT_DT;
    }

    Date UPDT_DT;

}
