package com.sushma.JPA2.JPAFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sushma.JPA2.JPAFiles.entities.Image;
import com.sushma.JPA2.JPAFiles.repos.ImageRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaFilesApplicationTests {

	@Autowired
	ImageRepository imageReposiotry;
	
	@Test
	public void saveImage()  throws Exception{
		Image image = new Image();
		image.setName("sample.jpg");
		
		
		File file = new File("C:\\Users\\End User\\Desktop\\India.txt");
		FileInputStream is = new FileInputStream(file);
		byte[] byteArr = new byte[(int)file.length()];
		is.read(byteArr);
		is.close();
		
		image.setData(byteArr);
		imageReposiotry.save(image);
	}
	
	@Test
	public void readImage()  throws Exception{
		Image image = imageReposiotry.findById(1);
		byte[] byteArr = image.getData();
		
		File file = new File("C:\\Users\\End User\\Desktop\\downloads\\testingJPA.txt");
		FileOutputStream os = new FileOutputStream(file);
		os.write(byteArr);
		os.close();
		
	}

}
