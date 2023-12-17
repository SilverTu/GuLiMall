package org.tshc.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;
import org.tshc.common.utils.PageUtils;
import org.tshc.member.entity.MemberLoginLogEntity;

/**
 * 会员登录记录
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:40:52
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

