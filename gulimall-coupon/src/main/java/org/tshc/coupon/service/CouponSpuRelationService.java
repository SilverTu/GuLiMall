package org.tshc.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;
import org.tshc.common.utils.PageUtils;
import org.tshc.coupon.entity.CouponSpuRelationEntity;

/**
 * 优惠券与产品关联
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:32:39
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

