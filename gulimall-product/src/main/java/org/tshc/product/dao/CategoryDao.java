package org.tshc.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.tshc.product.entity.CategoryEntity;

/**
 * 商品三级分类
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 14:12:16
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}
