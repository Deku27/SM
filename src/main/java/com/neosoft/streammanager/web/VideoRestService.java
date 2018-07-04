package com.neosoft.streammanager.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.neosoft.streammanager.entities.Video;
import com.neosoft.streammanager.dao.VideoRepository;

/**
 * @author e.lahrach
 *
 */
@RestController
public class VideoRestService {
	
	@Autowired
	private VideoRepository videoRepository;
	
	
	/**
	 * this method returns the list of all videos,
	 * @return the list of videos
	 */
	@RequestMapping(value ="/videos",method=RequestMethod.GET)
	public List<Video> getVideos(){
		return videoRepository.findAll();
	}
	
	/**
	 * this method returns a video by its id 
	 * @param id the video id
	 * @return the list of videos
	 */
	
	@RequestMapping(value ="/videos/{id}",method=RequestMethod.GET)
	public Video getVideo(@PathVariable   Long id){
		return videoRepository.findOne(id);
	}
	
	/**
	 * this method save a video in the database
	 * @param video Object
	 * @return the saved video
	 */
	
	@RequestMapping(value ="/videos",method=RequestMethod.POST)
	public Video save(@RequestBody Video v ){
		return videoRepository.save(v);
	}
	
	/**
	 * this method delete a video 
	 * @param video id
	 * @return true in case video has been successfully deleted
	 */
	@RequestMapping(value ="/video/{id}",method=RequestMethod.DELETE)
	public boolean delete(@PathVariable Long id ){
		videoRepository.delete(id);
		return true;
	}
	
	/**
	 * this method update a video in the database
	 * @param video id
	 * @param video Object
	 * @return the updated video
	 */
	
	@RequestMapping(value ="/video/{id}",method=RequestMethod.PUT)
	public Video save(@PathVariable Long id , @RequestBody Video v ){
		v.setVideoID(id);
		return videoRepository.save(v);
	}
	
	
	@RequestMapping(value ="/video/search",method=RequestMethod.GET)
	public Page<Video> search(
			@RequestParam(name="key", defaultValue="") String key,
			@RequestParam(name="page", defaultValue="0") int page,
			@RequestParam(name="size", defaultValue="5") int size
			){
		return videoRepository.search("%"+key+"%", new PageRequest(page, size));
	}
	
	
}
