package com.neosoft.streammanager.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.neosoft.streammanager.entities.Video;

public interface VideoRepository extends JpaRepository<Video, Long>{
	
	@Query("select v from Video where v.name like :x")
	public Page<Video> search(@Param("x") String key, Pageable pageable);

}
