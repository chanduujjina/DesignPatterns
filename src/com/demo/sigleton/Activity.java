package com.demo.sigleton;

public class Activity implements Cloneable{
	
	@Override
	public String toString() {
		return "Activity [activityId=" + activityId + ", activityName=" + activityName + ", activityType="
				+ activityType + "]";
	}

	private int activityId;
	
	private String activityName;
	
	private String activityType;
	
	public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}
	
	
	@Override
	 public  Object clone() throws CloneNotSupportedException {
		 throw new CloneNotSupportedException();
	 } 

}
