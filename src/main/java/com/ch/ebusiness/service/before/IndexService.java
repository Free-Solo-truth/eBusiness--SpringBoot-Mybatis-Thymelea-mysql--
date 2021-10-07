package com.ch.ebusiness.service.before;

import org.springframework.ui.Model;

public interface IndexService {
	public String selectAllGoodsByPage1(Model model, int currentPage, String act);
	public String index(Model model, Integer tid);
	public String goodsDetail(Model model, Integer id);
	public String search(Model model, String mykey);
}
