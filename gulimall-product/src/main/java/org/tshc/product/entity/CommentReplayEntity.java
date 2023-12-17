package org.tshc.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 商品评价回复关系
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 14:12:16
 */
@Data
@Accessors(chain = true)
@TableName("pms_comment_replay")
public class CommentReplayEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * id
   */
  @TableId
  private Long id;
  /**
   * 评论id
   */
  private Long commentId;
  /**
   * 回复id
   */
  private Long replyId;

}
