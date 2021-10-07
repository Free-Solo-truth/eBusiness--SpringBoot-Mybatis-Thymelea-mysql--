package com.ch.ebusiness.entity;

import org.springframework.web.multipart.MultipartFile;

public class Goods {
	private int id;
	private String gname;
	private double goprice;
	private double grprice;
	private int gstore;
	private String  gpicture;
	private String  advisepicture;//广告的图片
	private MultipartFile fileName;
	private MultipartFile advertiseFilename;//广告文件的路径
	private int goodstype_id;
	private String typename;
	private int buyNumber;//加入购物车使用
	private int isAdvertisement;//是否广告
	private int isRecommend;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public double getGoprice() {
		return goprice;
	}
	public void setGoprice(double goprice) {
		this.goprice = goprice;
	}
	public double getGrprice() {
		return grprice;
	}
	public void setGrprice(double grprice) {
		this.grprice = grprice;
	}
	public int getGstore() {
		return gstore;
	}
	public void setGstore(int gstore) {
		this.gstore = gstore;
	}
	public String  getGpicture() {
		return gpicture;
	}
	public void setGpicture(String  gpicture) { this.gpicture = gpicture; }
	public String getAdvisepicture(){return advisepicture;}
	public void setAdvisepicture(String advisepicture){ this.advisepicture=advisepicture; }
	public int getGoodstype_id() {
		return goodstype_id;
	}
	public void setGoodstype_id(int goodstype_id) {
		this.goodstype_id = goodstype_id;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public int getBuyNumber() {
		return buyNumber;
	}
	public void setBuyNumber(int buyNumber) {
		this.buyNumber = buyNumber;
	}
	public int getIsAdvertisement() {
		return isAdvertisement;
	}
	//设置广告图片加载的set和get方法
	public MultipartFile getAdvertiseFilename(){return advertiseFilename;}
	public void setAdvertiseFilename(MultipartFile advertiseFilename){this.advertiseFilename = advertiseFilename;}
	public void setIsAdvertisement(int isAdvertisement) {
		this.isAdvertisement = isAdvertisement;
	}
	public int getIsRecommend() {
		return isRecommend;
	}
	public void setIsRecommend(int isRecommend) {
		this.isRecommend = isRecommend;
	}
	public MultipartFile getFileName() {
		return fileName;
	}
	public void setFileName(MultipartFile fileName) {
		this.fileName = fileName;
	}
}
