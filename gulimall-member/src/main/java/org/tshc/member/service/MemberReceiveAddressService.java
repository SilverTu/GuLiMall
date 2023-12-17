package org.tshc.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import java.util.Map;
import org.tshc.common.utils.PageUtils;
import org.tshc.member.entity.MemberReceiveAddressEntity;

/**
 * 会员收货地址
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:40:52
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

  PageUtils queryPage(Map<String, Object> params);
}

