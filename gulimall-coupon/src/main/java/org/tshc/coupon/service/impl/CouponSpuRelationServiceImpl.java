package org.tshc.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.coupon.dao.CouponSpuRelationDao;
import org.tshc.coupon.entity.CouponSpuRelationEntity;
import org.tshc.coupon.service.CouponSpuRelationService;


@Service("couponSpuRelationService")
public class CouponSpuRelationServiceImpl extends
    ServiceImpl<CouponSpuRelationDao, CouponSpuRelationEntity> implements CouponSpuRelationService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<CouponSpuRelationEntity> page = this.page(
        new Query<CouponSpuRelationEntity>().getPage(params),
        new QueryWrapper<CouponSpuRelationEntity>()
    );

    return new PageUtils(page);
  }

}