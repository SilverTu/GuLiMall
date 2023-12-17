package org.tshc.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 品牌分类关联
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 14:12:16
 */
@Data
@Accessors(chain = true)
@TableName("pms_category_brand_relation")
public class CategoryBrandRelationEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   *
   */
  @TableId
  private Long id;
  /**
   * 品牌id
   */
  private Long brandId;
  /**
   * 分类id
   */
  private Long catelogId;
  /**
   *
   */
  private String brandName;
  /**
   *
   */
  private String catelogName;

}
