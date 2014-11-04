package com.android.os.backup.support;

import com.android.os.backup.http.HttpObj;

public class Backup {
	public Backup(){
		System.loadLibrary("backup");
	}
	
	
	public HttpObj getUrl(int i){
		return g(i);
	}
	
	public String getH(String arg1, int arg2){
		return h(arg1, arg2);
	}
	
	public native HttpObj g(int type);
	public native String h(String arg1, int arg2);
	public native String i(int arg1);
	public native boolean j();
	public native String b();
	public native String c();
	public native String d(String arg1);
	public native String e();
}
