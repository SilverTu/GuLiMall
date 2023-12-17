package org.tshc.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.coupon.dao.CouponDao;
import org.tshc.coupon.entity.CouponEntity;
import org.tshc.coupon.service.CouponService;


@Service("couponService")
public class CouponServiceImpl extends ServiceImpl<CouponDao, CouponEntity> implements
    CouponService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<CouponEntity> page = this.page(
        new Query<CouponEntity>().getPage(params),
        new QueryWrapper<CouponEntity>()
    );

    return new PageUtils(page);
  }

}