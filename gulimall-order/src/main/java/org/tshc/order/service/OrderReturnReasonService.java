package org.tshc.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;
import org.tshc.common.utils.PageUtils;
import org.tshc.order.entity.OrderReturnReasonEntity;

/**
 * 退货原因
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:18:53
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

