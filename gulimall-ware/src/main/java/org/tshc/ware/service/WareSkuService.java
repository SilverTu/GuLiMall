package org.tshc.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;
import org.tshc.common.utils.PageUtils;
import org.tshc.ware.entity.WareSkuEntity;

/**
 * 商品库存
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:47:24
 */
public interface WareSkuService extends IService<WareSkuEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

