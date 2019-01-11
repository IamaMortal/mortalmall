package com.mortal.mortalmall.util;

public class AjaxResult {

    private Long id;
    private boolean success = true;
    private String message = "操作成功！";
    private Object objectData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean getSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getObjectData() {
        return objectData;
    }

    public void setObjectData(Object objectData) {
        this.objectData = objectData;
    }

    public static AjaxResult me(){
        return new AjaxResult();
    }

    @Override
    public String toString() {
        return "AjaxResult{" +
                "id=" + id +
                ", success='" + success + '\'' +
                ", message='" + message + '\'' +
                ", objectData=" + objectData +
                '}';
    }
}
