package com.xworkz.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flight_details")
public class FlightEntity implements Serializable {
	@Id
	@Column(name = "f_id")
	private int fid;
	@Column(name = "f_name")
	private String fname;
	@Column(name = "f_dest")
	private String fdest;
	@Column(name = "fsource")
	private String fsource;

	public FlightEntity() {

	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFdest() {
		return fdest;
	}

	public void setFdest(String fdest) {
		this.fdest = fdest;
	}

	public String getFsource() {
		return getFsource();
	}

	public void setFsource(String fsource) {
		this.fsource = fsource;
	}

	@Override
	public String toString() {
		return "FlightEntity [f_id=" + fid + ", f_name=" + fname + ", f_dest=" + fdest + ", fsource=" + getFsource()
				+ "]";
	}

}
