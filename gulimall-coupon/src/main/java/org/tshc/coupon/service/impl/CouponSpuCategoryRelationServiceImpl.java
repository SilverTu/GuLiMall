package org.tshc.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.coupon.dao.CouponSpuCategoryRelationDao;
import org.tshc.coupon.entity.CouponSpuCategoryRelationEntity;
import org.tshc.coupon.service.CouponSpuCategoryRelationService;


@Service("couponSpuCategoryRelationService")
public class CouponSpuCategoryRelationServiceImpl extends
    ServiceImpl<CouponSpuCategoryRelationDao, CouponSpuCategoryRelationEntity> implements
    CouponSpuCategoryRelationService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<CouponSpuCategoryRelationEntity> page = this.page(
        new Query<CouponSpuCategoryRelationEntity>().getPage(params),
        new QueryWrapper<CouponSpuCategoryRelationEntity>()
    );

    return new PageUtils(page);
  }

}