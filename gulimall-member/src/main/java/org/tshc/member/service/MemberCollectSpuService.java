package org.tshc.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;
import org.tshc.common.utils.PageUtils;
import org.tshc.member.entity.MemberCollectSpuEntity;

/**
 * 会员收藏的商品
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:40:52
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

