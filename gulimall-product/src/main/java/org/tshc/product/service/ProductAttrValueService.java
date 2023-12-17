package org.tshc.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;
import org.tshc.common.utils.PageUtils;
import org.tshc.product.entity.ProductAttrValueEntity;

/**
 * spu属性值
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 14:12:16
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

