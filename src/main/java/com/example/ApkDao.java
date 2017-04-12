package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;

/**
 * Created by blue on 2017-04-12.
 */

@Repository
public class ApkDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public APK getApk(int apk_no) {
        String SQL = "Select * from APK_INFO_TB Where APK_NO = ?";
        Object[] param  = new Object[]{apk_no};

        APK apk = null;

        apk = jdbcTemplate.queryForObject(SQL, param, (rs, rowNum) -> {
            APK apk1 =  new APK();
            apk1.setAPK_NAME(rs.getString("APK_NAME"));
            apk1.setAPK_NO(rs.getInt("APK_NO"));
            apk1.setSTORAGE_URL(rs.getString("STORAGE_URL"));

            return apk1;
        });
        return apk;
    }
}
