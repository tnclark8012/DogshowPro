package dev.tnclark8012.dogshow.client.raw;

import java.io.Serializable;

public class DownloadableFile implements Serializable{
	protected byte[] content;
	protected String filename;
	protected String mimeType;
	
	public byte[] getContent(){
		return content;
	}
	
	public String getFilename(){
		return filename;
	}
	
	public String mimeType(){
		return mimeType;
	}
	
}
