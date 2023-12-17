package org.tshc.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.tshc.order.entity.PaymentInfoEntity;

/**
 * 支付信息表
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:18:54
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {

}
