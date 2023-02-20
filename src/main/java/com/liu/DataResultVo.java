package com.liu;

public class DataResultVo {
    private int status;
    private String message;
    private int fullResult;
    private int shortResult;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getFullResult() {
        return fullResult;
    }

    public void setFullResult(int fullResult) {
        this.fullResult = fullResult;
    }

    public int getShortResult() {
        return shortResult;
    }

    public void setShortResult(int shortResult) {
        this.shortResult = shortResult;
    }
}
