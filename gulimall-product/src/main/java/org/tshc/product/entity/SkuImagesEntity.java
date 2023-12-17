package org.tshc.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * sku图片
 *
 * @author tshc
 * @email example@gmail.com
 * @date 2023-12-15 14:12:16
 */
@Data
@Accessors(chain = true)
@TableName("pms_sku_images")
public class SkuImagesEntity implements Serializable {

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
   * 图片地址
   */
  private String imgUrl;
  /**
   * 排序
   */
  private Integer imgSort;
  /**
   * 默认图[0 - 不是默认图，1 - 是默认图]
   */
  private Integer defaultImg;

}
