package org.tshc.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.product.dao.SkuInfoDao;
import org.tshc.product.entity.SkuInfoEntity;
import org.tshc.product.service.SkuInfoService;


@Service("skuInfoService")
public class SkuInfoServiceImpl extends ServiceImpl<SkuInfoDao, SkuInfoEntity> implements
    SkuInfoService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SkuInfoEntity> page = this.page(
        new Query<SkuInfoEntity>().getPage(params),
        new QueryWrapper<SkuInfoEntity>()
    );

    return new PageUtils(page);
  }

}