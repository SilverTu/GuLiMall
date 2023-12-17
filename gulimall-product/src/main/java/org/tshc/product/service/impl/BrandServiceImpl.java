package org.tshc.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.product.dao.BrandDao;
import org.tshc.product.entity.BrandEntity;
import org.tshc.product.service.BrandService;


@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<BrandEntity> page = this.page(
        new Query<BrandEntity>().getPage(params),
        new QueryWrapper<BrandEntity>()
    );

    return new PageUtils(page);
  }

}