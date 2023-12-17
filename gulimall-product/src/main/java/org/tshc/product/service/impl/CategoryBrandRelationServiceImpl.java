package org.tshc.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.product.dao.CategoryBrandRelationDao;
import org.tshc.product.entity.CategoryBrandRelationEntity;
import org.tshc.product.service.CategoryBrandRelationService;


@Service("categoryBrandRelationService")
public class CategoryBrandRelationServiceImpl extends
    ServiceImpl<CategoryBrandRelationDao, CategoryBrandRelationEntity> implements
    CategoryBrandRelationService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<CategoryBrandRelationEntity> page = this.page(
        new Query<CategoryBrandRelationEntity>().getPage(params),
        new QueryWrapper<CategoryBrandRelationEntity>()
    );

    return new PageUtils(page);
  }

}