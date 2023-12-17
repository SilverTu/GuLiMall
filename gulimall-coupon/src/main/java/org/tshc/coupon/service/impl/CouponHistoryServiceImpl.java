package org.tshc.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.coupon.dao.CouponHistoryDao;
import org.tshc.coupon.entity.CouponHistoryEntity;
import org.tshc.coupon.service.CouponHistoryService;


@Service("couponHistoryService")
public class CouponHistoryServiceImpl extends
    ServiceImpl<CouponHistoryDao, CouponHistoryEntity> implements CouponHistoryService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<CouponHistoryEntity> page = this.page(
        new Query<CouponHistoryEntity>().getPage(params),
        new QueryWrapper<CouponHistoryEntity>()
    );

    return new PageUtils(page);
  }

}