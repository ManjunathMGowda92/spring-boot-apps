package org.fourstack.populationcensus.model;

import java.io.Serializable;

public class EndpointsDescription implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4866653972784427732L;
	
	private String _method;
	private String _uri;
	private String _description;
	
	public EndpointsDescription() {
	}
	
	public EndpointsDescription(String _method, String _uri, String _description) {
		this._method = _method;
		this._uri = _uri;
		this._description = _description;
	}

	public String get_method() {
		return _method;
	}

	public void set_method(String _method) {
		this._method = _method;
	}

	public String get_uri() {
		return _uri;
	}

	public void set_uri(String _uri) {
		this._uri = _uri;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String _description) {
		this._description = _description;
	}
}
