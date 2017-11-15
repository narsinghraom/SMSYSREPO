/**
 * 
 */
package com.eessn.sm.request;

/**
 * @author NARSINGH MAHANKALI
 * 
 * This class is used for sharing object.
 * it will return dummy object from db type.
 *
 */
public class RequestSharedObject 
{
	private static DummyObject dummyObject;
	private static RequestSharedObject requestSharedObject=new RequestSharedObject();
	
	public RequestSharedObject() {
		dummyObject=new DummyObject();
		
	}
	/**
	 * @return the dummyObject
	 */
	public  DummyObject getDummyObject() {
		return dummyObject;
	}
	/**
	 * @param dummyObject the dummyObject to set
	 */
	public  void setDummyObject(DummyObject dummyObject) {
		RequestSharedObject.dummyObject = dummyObject;
	}
	/**
	 * @return the requestSharedObject
	 */
	public static RequestSharedObject getRequestSharedObject() {
		return requestSharedObject;
	}
	/**
	 * @param requestSharedObject the requestSharedObject to set
	 */
	public static void setRequestSharedObject(
			RequestSharedObject requestSharedObject) {
		RequestSharedObject.requestSharedObject = requestSharedObject;
	}
	
	

}
