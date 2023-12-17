package org.tshc.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.coupon.dao.SpuBoundsDao;
import org.tshc.coupon.entity.SpuBoundsEntity;
import org.tshc.coupon.service.SpuBoundsService;


@Service("spuBoundsService")
public class SpuBoundsServiceImpl extends ServiceImpl<SpuBoundsDao, SpuBoundsEntity> implements
    SpuBoundsService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SpuBoundsEntity> page = this.page(
        new Query<SpuBoundsEntity>().getPage(params),
        new QueryWrapper<SpuBoundsEntity>()
    );

    return new PageUtils(page);
  }

}