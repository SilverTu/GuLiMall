package org.tshc.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.coupon.dao.SkuFullReductionDao;
import org.tshc.coupon.entity.SkuFullReductionEntity;
import org.tshc.coupon.service.SkuFullReductionService;


@Service("skuFullReductionService")
public class SkuFullReductionServiceImpl extends
    ServiceImpl<SkuFullReductionDao, SkuFullReductionEntity> implements SkuFullReductionService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SkuFullReductionEntity> page = this.page(
        new Query<SkuFullReductionEntity>().getPage(params),
        new QueryWrapper<SkuFullReductionEntity>()
    );

    return new PageUtils(page);
  }

}