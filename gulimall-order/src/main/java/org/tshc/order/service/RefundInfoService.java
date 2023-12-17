package org.tshc.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;
import org.tshc.common.utils.PageUtils;
import org.tshc.order.entity.RefundInfoEntity;

/**
 * 退款信息
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:18:54
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

