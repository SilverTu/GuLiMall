package org.tshc.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;
import org.tshc.common.utils.PageUtils;
import org.tshc.member.entity.GrowthChangeHistoryEntity;

/**
 * 成长值变化历史记录
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:40:52
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

