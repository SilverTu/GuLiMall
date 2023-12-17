package org.tshc.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.tshc.member.entity.MemberLevelEntity;

/**
 * 会员等级
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:40:52
 */
@Mapper
public interface MemberLevelDao extends BaseMapper<MemberLevelEntity> {

}
