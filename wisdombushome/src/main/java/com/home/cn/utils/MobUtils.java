package com.home.cn.utils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class MobUtils {
	
	public static String requestData(String phone, String code) {
		
		String appkey = "1e1a873c55519";
		String address = "https://webapi.sms.mob.com/sms/verify";
		String params = "appkey="+appkey+"&phone="+ phone +"&zone=86&&code=" + code;

		HttpURLConnection conn = null;
		try {
			TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
				public X509Certificate[] getAcceptedIssuers() {
					return null;
				}
				public void checkClientTrusted(X509Certificate[] certs, String authType) {
				}
				public void checkServerTrusted(X509Certificate[] certs, String authType) {
				}
			} };
			SSLContext sc = SSLContext.getInstance("TLS");
			sc.init(null, trustAllCerts, new SecureRandom());
			HostnameVerifier hv = new HostnameVerifier() {
				public boolean verify(String urlHostName, SSLSession session) {
					return urlHostName.equals(session.getPeerHost());
				}
			};
			HttpsURLConnection.setDefaultHostnameVerifier(hv);
			HttpsURLConnection
					.setDefaultSSLSocketFactory(sc.getSocketFactory());
			URL url = new URL(address);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");// POST
			conn.setConnectTimeout(3000);
			conn.setReadTimeout(3000);
			if (params != null) {
				conn.setDoOutput(true);
				DataOutputStream out = new DataOutputStream( conn.getOutputStream());
				out.write(params.getBytes(Charset.forName("UTF-8")));
				out.flush();
				out.close();
			}
			conn.connect();
			if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
				InputStream input = conn.getInputStream();
				BufferedReader in = new BufferedReader( new InputStreamReader( input));
				String line = null;
				StringBuffer sb = new StringBuffer();
				while ((line = in.readLine()) != null) {
					sb.append(line);
				}
				return sb.toString();				
			} else {
				System.out.println(conn.getResponseCode() + " " + conn.getResponseMessage());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				conn.disconnect();
		}
		return null;
	}
}