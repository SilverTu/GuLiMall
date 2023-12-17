package org.tshc.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.tshc.common.utils.PageUtils;
import org.tshc.common.utils.Query;
import org.tshc.product.dao.CategoryDao;
import org.tshc.product.entity.CategoryEntity;
import org.tshc.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements
    CategoryService {

  @Override
  public PageUtils queryPage(Map<String, Object> params) {
    IPage<CategoryEntity> page = this.page(
        new Query<CategoryEntity>().getPage(params),
        new QueryWrapper<CategoryEntity>()
    );

    return new PageUtils(page);
  }

}