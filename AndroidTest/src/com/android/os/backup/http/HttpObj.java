package com.android.os.backup.http;

import java.util.List;

public class HttpObj {
	List body;
	String contentType;
    String file;
    String fileName;
    String hash;
    List mRecordIds;
    String mValue;
    int timeout;
    String url;

    public HttpObj() {
        super();
        this.url = null;
        this.body = null;
        this.contentType = null;
        this.hash = null;
        this.timeout = 0;
        this.file = null;
        this.mRecordIds = null;
        this.fileName = null;
        this.mValue = null;
    }
    
    public String getUrl(){
    	return this.url;
    }
	
}
