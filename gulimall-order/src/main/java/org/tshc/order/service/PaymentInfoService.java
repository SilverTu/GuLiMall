package org.tshc.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;
import org.tshc.common.utils.PageUtils;
import org.tshc.order.entity.PaymentInfoEntity;

/**
 * 支付信息表
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:18:54
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

