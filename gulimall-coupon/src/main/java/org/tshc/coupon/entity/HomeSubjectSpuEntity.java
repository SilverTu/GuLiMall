package org.tshc.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 专题商品
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 15:32:39
 */
@Data
@Accessors(chain = true)
@TableName("sms_home_subject_spu")
public class HomeSubjectSpuEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * id
   */
  @TableId
  private Long id;
  /**
   * 专题名字
   */
  private String name;
  /**
   * 专题id
   */
  private Long subjectId;
  /**
   * spu_id
   */
  private Long spuId;
  /**
   * 排序
   */
  private Integer sort;

}
