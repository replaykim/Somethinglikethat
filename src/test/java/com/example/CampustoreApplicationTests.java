package com.example;

import com.example.dao.ApkDao;
import com.example.model.APK;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CampustoreApplicationTests {

	@Autowired
	ApkDao apkDao;

	@Before
	public void setup(){

	}
	@Test
	public void APKListget(){
		int APK1_NO = 3;
		int APK2_NO = 4;

		List<APK> APKs = apkDao.getApkList();

		assertThat(APK1_NO, is(APKs.get(0).getAPK_NO()));
		assertThat(APK2_NO, is(APKs.get(1).getAPK_NO()));

	}
	@Test
	public void APKget(){

		String APK_NAME = "asdf";
		String STORAGE_URL = "https://console.firebase.google.com";
		int APK_NO = 4;

		APK apk = apkDao.getApk(APK_NO);

		assertThat(APK_NAME, is(apk.getAPK_NAME()));
		assertThat(STORAGE_URL, is(apk.getSTORAGE_URL()));
		assertThat(APK_NO, is(apk.getAPK_NO()));


	}

}
