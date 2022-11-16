package com.rrays.mapper;

import com.rrays.bean.TblCompany;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 企业档案 Mapper 接口
 * </p>
 *
 * @author lian
 * @since 2022-08-08
 */
public interface TblCompanyMapper extends BaseMapper<TblCompany> {

    public List<TblCompany> selectCompany();

}
