package org.tshc.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;
import org.tshc.common.utils.PageUtils;
import org.tshc.member.entity.MemberEntity;

/**
 * 会员
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:40:52
 */
public interface MemberService extends IService<MemberEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

