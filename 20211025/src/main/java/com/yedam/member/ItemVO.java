package com.yedam.member;

public class ItemVO {
	int prod_id;
	String prod_item;
	String prod_desc;
	double like_it;
	int origin_price;
	int sale_price;
	String prod_image;
	
	public int getProd_id() {
		return prod_id;
	}
	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}
	public String getProd_item() {
		return prod_item;
	}
	public void setProd_item(String prod_item) {
		this.prod_item = prod_item;
	}
	public String getProd_desc() {
		return prod_desc;
	}
	public void setProd_desc(String prod_desc) {
		this.prod_desc = prod_desc;
	}
	public double getLike_it() {
		return like_it;
	}
	public void setLike_it(double like_it) {
		this.like_it = like_it;
	}
	public int getOrigin_price() {
		return origin_price;
	}
	public void setOrigin_price(int origin_price) {
		this.origin_price = origin_price;
	}
	public int getSale_price() {
		return sale_price;
	}
	public void setSale_price(int sale_price) {
		this.sale_price = sale_price;
	}
	public String getProd_image() {
		return prod_image;
	}
	public void setProd_image(String prod_image) {
		this.prod_image = prod_image;
	}
	
	@Override
	public String toString() {
		System.out.println("ItemVO [prod_id=" + prod_id + ", prod_item=" + prod_item + ", prod_desc=" + prod_desc + ", like_it="
				+ like_it + ", origin_price=" + origin_price + ", sale_price=" + sale_price + ", prod_image="
				+ prod_image + "]");
		
		return null;
	}
	
	
}
