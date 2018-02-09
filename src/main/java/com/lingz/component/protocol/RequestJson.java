package com.lingz.component.protocol;

/**
 * @desc: 请求body json对象
 * @author:linguozhi@52tt.com
 * @date: 2016/4/6
 */
public class RequestJson {
    public Long id;
    public RequestJson.Client client;
    public Object data;
    public String encrypt;
    public String sign;

    public RequestJson() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long var1) {
        this.id = var1;
    }

    public RequestJson.Client getClient() {
        return this.client;
    }

    public void setClient(RequestJson.Client var1) {
        this.client = var1;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object var1) {
        this.data = var1;
    }

    public String getEncrypt() {
        return this.encrypt;
    }

    
    public void setEncrypt(String var1) {
        this.encrypt = var1;
    }

    public String getSign() {
        return this.sign;
    }

    public void setSign(String var1) {
        this.sign = var1;
    }

    public static class Client {
        public String caller;
        public String ex;

        public Client() {
        }

        public String getCaller() {
            return this.caller;
        }

        public void setCaller(String var1) {
            this.caller = var1;
        }

        public String getEx() {
            return this.ex;
        }

        public void setEx(String var1) {
            this.ex = var1;
        }
    }
}
