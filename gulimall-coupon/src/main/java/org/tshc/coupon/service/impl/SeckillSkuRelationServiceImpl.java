package org.tshc.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.coupon.dao.SeckillSkuRelationDao;
import org.tshc.coupon.entity.SeckillSkuRelationEntity;
import org.tshc.coupon.service.SeckillSkuRelationService;


@Service("seckillSkuRelationService")
public class SeckillSkuRelationServiceImpl extends
    ServiceImpl<SeckillSkuRelationDao, SeckillSkuRelationEntity> implements
    SeckillSkuRelationService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SeckillSkuRelationEntity> page = this.page(
        new Query<SeckillSkuRelationEntity>().getPage(params),
        new QueryWrapper<SeckillSkuRelationEntity>()
    );

    return new PageUtils(page);
  }

}