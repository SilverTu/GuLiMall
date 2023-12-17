package org.tshc.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 属性分组
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 14:12:16
 */
@Data
@Accessors(chain = true)
@TableName("pms_attr_group")
public class AttrGroupEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * 分组id
   */
  @TableId
  private Long attrGroupId;
  /**
   * 组名
   */
  private String attrGroupName;
  /**
   * 排序
   */
  private Integer sort;
  /**
   * 描述
   */
  private String descript;
  /**
   * 组图标
   */
  private String icon;
  /**
   * 所属分类id
   */
  private Long catelogId;

}
