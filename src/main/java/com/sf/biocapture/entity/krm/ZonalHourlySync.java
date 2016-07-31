package com.sf.biocapture.entity.krm;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import nw.orm.core.IEntity;

@Entity
@Table(name = "ZONAL_HOURLY_SYNC")
public class ZonalHourlySync extends IEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8120550132021859369L;

	@Column(name = "ZONE", nullable = false, length = 24)
	private String zone;
	
	@Column(name = "SYNC_TIME")
	private int syncTime;
	
	@Column(name = "SYNC_DAY")
	private int syncDay;
	
	@Column(name = "SYNC_WEEK")
	private int syncWeek;
	
	@Column(name = "SYNC_MONTH")
	private int syncMonth;
	
	@Column(name = "SYNC_YEAR")
	private int syncYear;
	
	@Column(name = "SYNC_COUNT")
	private Long syncCount;
	
	@Column(name = "PREV_SYNC_COUNT")
	private Long prevSyncCount;
	
	@Column(name = "ACTIVE_KITS")
	private int activeKits;
	
	@Column(name = "DAY_SYNC_COUNT")
	private Long daySyncCount;
	
	@Column(name = "PREV_DAY_SYNC_COUNT")
	private Long prevDaySyncCount;
	
	@Column(name = "DAY_ACTIVE_KITS")
	private int dayActiveKits;
	
	@Column(name = "HOURLY_DIFF")
	private Long hourlyDifference;
	
	@Column(name = "DAY_SYNC_DIFF")
	private Long daySyncDifference;
	
	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public int getSyncTime() {
		return syncTime;
	}

	public void setSyncTime(int syncTime) {
		this.syncTime = syncTime;
	}

	public int getSyncDay() {
		return syncDay;
	}

	public void setSyncDay(int syncDay) {
		this.syncDay = syncDay;
	}

	public int getSyncWeek() {
		return syncWeek;
	}

	public void setSyncWeek(int syncWeek) {
		this.syncWeek = syncWeek;
	}

	public int getSyncMonth() {
		return syncMonth;
	}

	public void setSyncMonth(int syncMonth) {
		this.syncMonth = syncMonth;
	}

	public int getSyncYear() {
		return syncYear;
	}

	public void setSyncYear(int syncYear) {
		this.syncYear = syncYear;
	}

	public Long getDaySyncCount() {
		return daySyncCount;
	}

	public void setDaySyncCount(Long daySyncCount) {
		this.daySyncCount = daySyncCount;
	}

	public Long getHourlyDifference() {
		return hourlyDifference;
	}

	public void setHourlyDifference(Long hourlyDifference) {
		this.hourlyDifference = hourlyDifference;
	}

	public Long getDaySyncDifference() {
		return daySyncDifference;
	}

	public void setDaySyncDifference(Long daySyncDifference) {
		this.daySyncDifference = daySyncDifference;
	}

	public static void main(String[] args) {
		Calendar i = Calendar.getInstance();
		System.out.println(i.get(Calendar.YEAR));
		
		System.out.println(Integer.MAX_VALUE);
	}

	public int getActiveKits() {
		return activeKits;
	}

	public void setActiveKits(int activeKits) {
		this.activeKits = activeKits;
	}

	public int getDayActiveKits() {
		return dayActiveKits;
	}

	public void setDayActiveKits(int dayActiveKits) {
		this.dayActiveKits = dayActiveKits;
	}

	public Long getSyncCount() {
		return syncCount;
	}

	public void setSyncCount(Long syncCount) {
		this.syncCount = syncCount;
	}

	public Long getPrevSyncCount() {
		return prevSyncCount;
	}

	public void setPrevSyncCount(Long prevSyncCount) {
		this.prevSyncCount = prevSyncCount;
	}

	public Long getPrevDaySyncCount() {
		return prevDaySyncCount;
	}

	public void setPrevDaySyncCount(Long prevDaySyncCount) {
		this.prevDaySyncCount = prevDaySyncCount;
	}

}
