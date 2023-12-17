package org.tshc.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.tshc.order.entity.RefundInfoEntity;

/**
 * 退款信息
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:18:54
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {

}
