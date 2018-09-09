package com.goddice.dal.dao;

import com.goddice.model.BcDhandleInfo;
import com.goddice.model.BcDhandleInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BcDhandleInfoMapper {
    int countByExample(BcDhandleInfoExample example);

    int deleteByExample(BcDhandleInfoExample example);

    int insert(BcDhandleInfo record);

    int insertSelective(BcDhandleInfo record);

    List<BcDhandleInfo> selectByExampleWithBLOBs(BcDhandleInfoExample example);

    List<BcDhandleInfo> selectByExample(BcDhandleInfoExample example);

    int updateByExampleSelective(@Param("record") BcDhandleInfo record, @Param("example") BcDhandleInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") BcDhandleInfo record, @Param("example") BcDhandleInfoExample example);

    int updateByExample(@Param("record") BcDhandleInfo record, @Param("example") BcDhandleInfoExample example);
}