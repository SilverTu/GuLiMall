package org.tshc.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.product.dao.SkuSaleAttrValueDao;
import org.tshc.product.entity.SkuSaleAttrValueEntity;
import org.tshc.product.service.SkuSaleAttrValueService;


@Service("skuSaleAttrValueService")
public class SkuSaleAttrValueServiceImpl extends
    ServiceImpl<SkuSaleAttrValueDao, SkuSaleAttrValueEntity> implements SkuSaleAttrValueService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SkuSaleAttrValueEntity> page = this.page(
        new Query<SkuSaleAttrValueEntity>().getPage(params),
        new QueryWrapper<SkuSaleAttrValueEntity>()
    );

    return new PageUtils(page);
  }

}