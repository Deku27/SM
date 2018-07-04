package com.neosoft.streammanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.neosoft.streammanager.dao.VideoRepository;
import com.neosoft.streammanager.entities.Video;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	@Autowired
	private VideoRepository videoRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		videoRepository.save(new Video("hello","dqsdqsdqs","sddsqdqs"));
		videoRepository.save(new Video("hellow","dqsdqsdqs","sddsqdqs"));
		videoRepository.save(new Video("hellowwww","dqsdqsdqs","sddsqdqs"));
		
	}
}
