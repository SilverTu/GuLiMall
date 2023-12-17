package org.tshc.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;
import org.tshc.common.utils.PageUtils;
import org.tshc.coupon.entity.SkuLadderEntity;

/**
 * 商品阶梯价格
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:32:39
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

