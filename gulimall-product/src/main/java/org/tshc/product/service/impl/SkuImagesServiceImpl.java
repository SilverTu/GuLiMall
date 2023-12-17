package org.tshc.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.product.dao.SkuImagesDao;
import org.tshc.product.entity.SkuImagesEntity;
import org.tshc.product.service.SkuImagesService;


@Service("skuImagesService")
public class SkuImagesServiceImpl extends ServiceImpl<SkuImagesDao, SkuImagesEntity> implements
    SkuImagesService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SkuImagesEntity> page = this.page(
        new Query<SkuImagesEntity>().getPage(params),
        new QueryWrapper<SkuImagesEntity>()
    );

    return new PageUtils(page);
  }

}