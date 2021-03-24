package com.example.taskqueue;

public class TelcoRequest {
    @Override
	public String toString() {
		return "TelcoRequest [getMSISDN()=" + getMSISDN() + ", getStartDate()=" + getStartDate() + ", getEndDate()="
				+ getEndDate() + "]";
	}

	private String MSISDN;
    private String startDate, endDate;

    public TelcoRequest(String MSISDN, String startDate, String endDate) {
        this.MSISDN = MSISDN;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public TelcoRequest() {
    }

    public String getMSISDN() {
        return MSISDN;
    }

    public void setMSISDN(String MSISDN) {
        this.MSISDN = MSISDN;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
