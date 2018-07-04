package com.neosoft.streammanager.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity 
public class Video implements Serializable {
	
	@Id @GeneratedValue
	private Long videoID;
	private String name;
    private String eit;
    private String audio;
    private String subtitles;
    private String pmt;
    private String color;
    private String resolution;
    private String ocs;
    private String csa5;
    private String format;
    private String enabled;
    private String description;
    private String status;
    private String del;
    
    
	public Video() {
		super();
	}
	

	public Video(String name, String eit, String audio) {
		this.name = name;
		this.eit = eit;
		this.audio = audio;
	}


	public Video(String name, String eit, String audio, String subtitles, String pmt, String color, String resolution,
			String ocs, String csa5, String format, String enabled, String description, String status, String del) {
		super();
		this.name = name;
		this.eit = eit;
		this.audio = audio;
		this.subtitles = subtitles;
		this.pmt = pmt;
		this.color = color;
		this.resolution = resolution;
		this.ocs = ocs;
		this.csa5 = csa5;
		this.format = format;
		this.enabled = enabled;
		this.description = description;
		this.status = status;
		this.del = del;
	}


	public Long getVideoID() {
		return videoID;
	}


	public void setVideoID(Long videoID) {
		this.videoID = videoID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEit() {
		return eit;
	}


	public void setEit(String eit) {
		this.eit = eit;
	}


	public String getAudio() {
		return audio;
	}


	public void setAudio(String audio) {
		this.audio = audio;
	}


	public String getSubtitles() {
		return subtitles;
	}


	public void setSubtitles(String subtitles) {
		this.subtitles = subtitles;
	}


	public String getPmt() {
		return pmt;
	}


	public void setPmt(String pmt) {
		this.pmt = pmt;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getResolution() {
		return resolution;
	}


	public void setResolution(String resolution) {
		this.resolution = resolution;
	}


	public String getOcs() {
		return ocs;
	}


	public void setOcs(String ocs) {
		this.ocs = ocs;
	}


	public String getCsa5() {
		return csa5;
	}


	public void setCsa5(String csa5) {
		this.csa5 = csa5;
	}


	public String getFormat() {
		return format;
	}


	public void setFormat(String format) {
		this.format = format;
	}


	public String getEnabled() {
		return enabled;
	}


	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getDel() {
		return del;
	}


	public void setDel(String del) {
		this.del = del;
	}
    
	
    
}
