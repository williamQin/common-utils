package com.william.httpclient;

import java.util.HashMap;
import java.util.Map;

/**
 * Date:     2015-10-19 ����10:07:10<br/>
 * @author   [William.Qin]
 * @version  2.0
 * @since    JDK 1.6
 */
public class HttpRequest {
	
	/**
	 * Ĭ�ϵ�������뷽ʽ("UTF-8")
	 */
	private String charset = "UTF-8";
	
	/**
	 * ���ʳ�ʱʱ��
	 */
	private int timeout = 0;
	
	/**
	 * ���ӳ�ʱʱ��
	 */
	private int connectTimeout = 0;
	
	/**
	 * �������URL
	 */
	private String url = null;
	
	/**
	 * ������ı�����
	 */
	private Map<String, String> parametersMap = null;
	
	/**
	 * �ϴ������ص��ļ�·��
	 */
	private String filePath;
	
	/**
	 * �ϴ��������ļ����ļ���
	 */
	private String fileName;
	
	/**
	 * �����𷽵�Ip��ַ
	 */
	private String clientIp;

	public String getUrl() {
	
		return url;
	}

	public void setUrl(String url) {
	
		this.url = url;
	}

	public int getTimeout() {
	
		return timeout;
	}

	public void setTimeout(int timeout) {
	
		this.timeout = timeout;
	}

	public int getConnectTimeout() {
	
		return connectTimeout;
	}

	public void setConnectTimeout(int connectTimeout) {
	
		this.connectTimeout = connectTimeout;
	}

	public Map<String, String> getParametersMap() {
	
		return parametersMap;
	}

	public void setParametersMap(Map<String, String> parametersMap) {
	
		this.parametersMap = parametersMap;
	}

	public String getCharset() {
	
		return charset;
	}

	public void setCharset(String charset) {
	
		this.charset = charset;
	}

	public String getClientIp() {
	
		return clientIp;
	}

	public void setClientIp(String clientIp) {
	
		this.clientIp = clientIp;
	}

	public String getFilePath() {
	
		return filePath;
	}

	public void setFilePath(String filePath) {
	
		this.filePath = filePath;
	}

	public String getFileName() {
	
		return fileName;
	}

	public void setFileName(String fileName) {
	
		this.fileName = fileName;
	}
	
	/**
	 * @param key ������
	 * @param value ����ֵ
	 * @return
	 */
	public HttpRequest setRequestParam(String key, String value){
		if(this.parametersMap == null){
			this.parametersMap = new HashMap<String, String>();
		}
		this.parametersMap.put(key, value);
		return this;
	}
	
}
