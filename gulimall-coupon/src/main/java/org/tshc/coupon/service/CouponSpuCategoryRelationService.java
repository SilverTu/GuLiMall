package org.tshc.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;
import org.tshc.common.utils.PageUtils;
import org.tshc.coupon.entity.CouponSpuCategoryRelationEntity;

/**
 * 优惠券分类关联
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:32:39
 */
public interface CouponSpuCategoryRelationService extends
    IService<CouponSpuCategoryRelationEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

