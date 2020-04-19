package com.returnobject;

public class ErrorInfo {
	String msgs[] = {
			"Output Error",
			"Input Error",
			"Disk Full",
			"Index Out-Of-Bounds"
	};
	
	int howbad[] = {3, 3, 2 ,4};
	
	ErrClass getErrorInfo(int i) {
		if(i >= 0 & i < msgs.length)
			return new ErrClass(msgs[i], howbad[i]);
		else
			return new ErrClass("Invalid Errod Code", 0);
	}
}
