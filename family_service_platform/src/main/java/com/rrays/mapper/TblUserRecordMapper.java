package com.rrays.mapper;

import com.rrays.bean.TblUserRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.Mapping;

/**
 * <p>
 * 用户档案 Mapper 接口
 * </p>
 *
 * @author lian
 * @since 2022-08-08
 */
@Component
//@Mapper 对不对呢
public interface TblUserRecordMapper extends BaseMapper<TblUserRecord> {

    public TblUserRecord login(@Param("username") String username,@Param("password") String password);

}
