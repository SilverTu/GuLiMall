package org.tshc.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;
import org.tshc.common.utils.PageUtils;
import org.tshc.coupon.entity.HomeSubjectSpuEntity;

/**
 * 专题商品
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:32:39
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

