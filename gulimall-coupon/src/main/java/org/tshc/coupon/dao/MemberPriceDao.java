package org.tshc.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.tshc.coupon.entity.MemberPriceEntity;

/**
 * 商品会员价格
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:32:39
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {

}
