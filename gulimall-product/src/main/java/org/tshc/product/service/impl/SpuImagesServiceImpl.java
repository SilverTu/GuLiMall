package org.tshc.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.product.dao.SpuImagesDao;
import org.tshc.product.entity.SpuImagesEntity;
import org.tshc.product.service.SpuImagesService;


@Service("spuImagesService")
public class SpuImagesServiceImpl extends ServiceImpl<SpuImagesDao, SpuImagesEntity> implements
    SpuImagesService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<SpuImagesEntity> page = this.page(
        new Query<SpuImagesEntity>().getPage(params),
        new QueryWrapper<SpuImagesEntity>()
    );

    return new PageUtils(page);
  }

}