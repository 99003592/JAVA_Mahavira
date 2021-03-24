package com.ltts;

class HotelRoom {
	private String hotelName;
	private int numberOfSqFeet;
	private boolean hasTV;
	private boolean hasWifi;
	
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getNumberOfSqFeet() {
		return numberOfSqFeet;
	}
	public void setNumberOfSqFeet(int numberOfSqFeet) {
		this.numberOfSqFeet = numberOfSqFeet;
	}
	public boolean isHasTV() {
		return hasTV;
	}
	public void setHasTV(boolean hasTV) {
		this.hasTV = hasTV;
	}
	public boolean isHasWifi() {
		return hasWifi;
	}
	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}
	public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super();
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	
	public int calculateTariff(int cost) {
		int sqft = (this.numberOfSqFeet);
		int totalC = sqft * cost;
		return totalC;
	}
	
	public int getRatePerSqFeet() {
		return 0;
	}
}

class DeluxeRoom extends HotelRoom {
	private int ratePerSqFeet;
	
	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi, int ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 10;
	}

	public int getRatePerSqFeet() {
		if(this.isHasWifi()) {
			return ratePerSqFeet+2;
		} else {
			return ratePerSqFeet;
		}		
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}
}

class DeluxACRoom extends DeluxeRoom {
	private int ratePerSqFeet;

	public int getRatePerSqFeet() {
		return ratePerSqFeet;
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}

	public DeluxACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi, int ratePerSqFeet,
			int ratePerSqFeet2) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi, ratePerSqFeet);
		this.ratePerSqFeet  = 12;
	}
}

class SuiteACRoom extends HotelRoom {
	private int ratePerSqFeet;

	public int getRatePerSqFeet() {
		if(this.isHasWifi() == true) {
			return ratePerSqFeet+2;
		} else {
			return ratePerSqFeet;
		}	
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}

	public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi, int ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 15;
	}	
}

