package org.tshc.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;
import org.tshc.common.utils.PageUtils;
import org.tshc.coupon.entity.SpuBoundsEntity;

/**
 * 商品spu积分设置
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:32:39
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

