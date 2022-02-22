package com.RMGYantra_POJO_Class;

public class Pojo_Library {

	String createdBy;
	String projectName;
	String status;
	int  teamsize;

	public  Pojo_Library(String createdBy,String projectName,String status,int teamsize) {
		this.createdBy =createdBy;
		this.projectName=projectName;
		this.status=status;
		this.teamsize=teamsize;

	}
	public String getcreatedBy() {
		return createdBy;
	}
	public void setcreatedBy(String createdBy){
		this.createdBy =createdBy;
	}
	public String getprojectNam() {
		return projectName;

	}
	public void setprojectNam(String projectNam){
		this.projectName = projectNam;
	}
	public String getstatus() {
		return status;

	}
	public void setstatus(String status){
		this.status = status;
	}
	
	public int getteamsize() {
		return teamsize;
	}
	public void setteamsize(int teamsize){
		this.teamsize = teamsize;
}
}