package com.ch.ebusiness.repository.before;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ch.ebusiness.entity.Goods;
import com.ch.ebusiness.entity.GoodsType;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IndexRepository {
	int selectAllGoods1();
	public List<Goods> selectAdvertisementGoods();
	public List<GoodsType> selectGoodsType();
	public List<Goods> selectRecommendGoods(Integer tid);
	List<Goods> selectAllGoodsByPage1(@Param("startIndex") int startIndex, @Param("perPageSize") int perPageSize);
	public List<Goods> selectLastedGoods(Integer tid);
	public Goods selectAGoods(Integer id);
	public List<Goods> search(String mykey);
}
