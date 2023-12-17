package org.tshc.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;
import org.tshc.common.utils.PageUtils;
import org.tshc.coupon.entity.CouponHistoryEntity;

/**
 * 优惠券领取历史记录
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:32:39
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

