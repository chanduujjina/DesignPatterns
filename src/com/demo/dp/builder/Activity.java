package com.demo.dp.builder;

public final class Activity {
	
	
	private final int id;
	
	private final String activityName;
	
	private final String actirivtyType;
	
	private Activity(ActivityBulder activityBulder) {
		this.id = activityBulder.id;
		this.activityName = activityBulder.activityName;
		this.actirivtyType = activityBulder.actirivtyType;
	}
	
	public static class ActivityBulder {
		
		private  int id;
		
		private  String activityName;
		
		private  String actirivtyType;
		
		public ActivityBulder id(int id) {
			this.id=id;
			return this;
		}
		
		public ActivityBulder activityName(String  activityName) {
			this.activityName=activityName;
			return this;
		}
		
		public ActivityBulder actirivtyType(String actirivtyType) {
			this.actirivtyType=actirivtyType;
			return this;
		}
		
		public Activity build() {
			return new Activity(this);
		}
		
	}
	public int getId() {
		return id;
	}

	public String getActivityName() {
		return activityName;
	}

	public String getActirivtyType() {
		return actirivtyType;
	}
	
	@Override
	public String toString() {
		return "Activity [id=" + id + ", activityName=" + activityName + ", actirivtyType=" + actirivtyType + "]";
	}


}
