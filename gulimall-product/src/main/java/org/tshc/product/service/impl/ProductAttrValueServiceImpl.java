package org.tshc.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.product.dao.ProductAttrValueDao;
import org.tshc.product.entity.ProductAttrValueEntity;
import org.tshc.product.service.ProductAttrValueService;


@Service("productAttrValueService")
public class ProductAttrValueServiceImpl extends
    ServiceImpl<ProductAttrValueDao, ProductAttrValueEntity> implements ProductAttrValueService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<ProductAttrValueEntity> page = this.page(
        new Query<ProductAttrValueEntity>().getPage(params),
        new QueryWrapper<ProductAttrValueEntity>()
    );

    return new PageUtils(page);
  }

}