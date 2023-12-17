package org.tshc.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;
import org.tshc.common.utils.PageUtils;
import org.tshc.member.entity.MemberCollectSubjectEntity;

/**
 * 会员收藏的专题活动
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:40:52
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

