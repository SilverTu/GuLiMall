package org.tshc.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 会员收藏的专题活动
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:40:52
 */
@Data
@Accessors(chain = true)
@TableName("ums_member_collect_subject")
public class MemberCollectSubjectEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * id
   */
  @TableId
  private Long id;
  /**
   * subject_id
   */
  private Long subjectId;
  /**
   * subject_name
   */
  private String subjectName;
  /**
   * subject_img
   */
  private String subjectImg;
  /**
   * 活动url
   */
  private String subjectUrll;

}
