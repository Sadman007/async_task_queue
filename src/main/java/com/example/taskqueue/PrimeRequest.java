package com.example.taskqueue;

public class PrimeRequest {
    @Override
	public String toString() {
		return "PrimeRequest [getFrom()=" + getFrom() + ", getTo()=" + getTo() + "]";
	}

	private Integer from;
    private Integer to;
    public PrimeRequest(Integer from, Integer to) {
        this.from = from;
        this.to = to;
    }
    public PrimeRequest() {
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getTo() {
        return to;
    }

    public void setTo(Integer to) {
        this.to = to;
    }
}
