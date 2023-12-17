package org.tshc.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.tshc.member.entity.MemberCollectSpuEntity;

/**
 * 会员收藏的商品
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:40:52
 */
@Mapper
public interface MemberCollectSpuDao extends BaseMapper<MemberCollectSpuEntity> {

}
