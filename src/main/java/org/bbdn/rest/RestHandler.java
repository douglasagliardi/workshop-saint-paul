package org.bbdn.rest;

public interface RestHandler {

	String getAll(String access_token);

	String createObject(String access_token);

	String readObject(String access_token);

	String updateObject(String access_token);

	String deleteObject(String access_token);

}
