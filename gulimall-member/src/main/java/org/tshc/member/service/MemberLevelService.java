package org.tshc.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;
import org.tshc.common.utils.PageUtils;
import org.tshc.member.entity.MemberLevelEntity;

/**
 * 会员等级
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:40:52
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

