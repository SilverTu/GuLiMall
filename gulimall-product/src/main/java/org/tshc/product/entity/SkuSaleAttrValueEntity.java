package org.tshc.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * sku销售属性&值
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 14:12:16
 */
@Data
@Accessors(chain = true)
@TableName("pms_sku_sale_attr_value")
public class SkuSaleAttrValueEntity implements Serializable {

  private static final long serialVersionUID = 1L;

  /**
   * id
   */
  @TableId
  private Long id;
  /**
   * sku_id
   */
  private Long skuId;
  /**
   * attr_id
   */
  private Long attrId;
  /**
   * 销售属性名
   */
  private String attrName;
  /**
   * 销售属性值
   */
  private String attrValue;
  /**
   * 顺序
   */
  private Integer attrSort;

}
