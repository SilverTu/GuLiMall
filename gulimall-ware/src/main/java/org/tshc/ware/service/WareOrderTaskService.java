package org.tshc.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;
import org.tshc.common.utils.PageUtils;
import org.tshc.ware.entity.WareOrderTaskEntity;

/**
 * 库存工作单
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:47:24
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

